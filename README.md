soundcloud-console
==================

Console app for soundcloud. I wrote this after seeing cmd.fm. 
As I was playing around with it, I thought to myself - I want to be able 
to do this on my actual terminal! So I wrote this.

Usage
=====

*OSX ONLY.*

This program utilizes __afplay__, an Apple-specific utility that plays audio 
files from the console. It will work on OSX 10.5 or later.

Search
------

	sc search <search term>

This will give you a list of soundcloud results from that term, with their 
Track ID in green. 

Options:

-l <#>

Adding -l to search will allow you to increase or decrease the amount of 
search results returned by the program.

Play
----

	sc play <track id>

This will play the track that you input. It is suggested that you use the track ID when actually 
playing a track, as entering the name will play the first result.

WARNING: This will temporarily download your song, and then delete it after 
the song is finished playing. If you stop the song partway through, the track 
will not delete!

Download
--------

	sc download <track id>

Same as sc play, but will save the file with a more descriptive filename. 
This will also not play or delete the track.

Installation
============

This program requires the soundcloud python api:

	pip install soundcloud

or

	easy_install soundcloud

Besides that, just download it and run it in a terminal. If you have 
any issues, _please_ create an issue report! I will be sure to get back to 
you ASAP!

Licensing
=========

THE ONLY THING I OWN HERE IS THE CODE IN THIS PROGRAM!!!

[![Powered By SoundCloud](https://developers.soundcloud.com/assets/powered_by_black-ee7e351d64511ecea75c6c17ca30064f.png)](http://www.soundcloud.com)
