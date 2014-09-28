#!/usr/bin/env python
import soundcloud
import argparse
from subprocess import call
import time

cid="d72876219b95015e95f92175521bf18b"

parser = argparse.ArgumentParser()
client = soundcloud.Client(client_id=cid)

verbs = ["search", "play", "download"]

parser.add_argument("verb", help="Choose which action to run", choices=verbs)
parser.add_argument("input", help="Input string")
parser.add_argument("-l", "--limit", help="Restrict search results", type=int)
args = parser.parse_args()
if args.verb==verbs[0]:
	tracks = client.get("/tracks", q=args.input, limit=args.limit if args.limit else 10)
	for track in tracks:
		print "\033[92m["+str(track.id)+"] \033[0m"+track.title
elif args.verb==verbs[1]:
	track = client.get("/tracks/"+args.input)
	call(["wget", track.stream_url+"?client_id="+str(cid), "--output-document="+args.input+".mp3"])
	call(["afplay", args.input+".mp3"])
	call(["rm", "-rf", args.input+".mp3"])
elif args.verb==verbs[2]:
	track = client.get("/tracks/"+args.input)
	call(["wget", track.stream_url+"?client_id="+str(cid), "-O "+track.title+".mp3"])
