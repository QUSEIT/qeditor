package com.quseit.texteditor.androidlib.data;

import java.util.Hashtable;

/**
 * Enhanced myme types detection
 */
public class MimeTypeMapEnhanced {

	/**
	 * Constructor (private)
	 */
	private MimeTypeMapEnhanced() {
	}

	/**
	 * @return the binding between file extension and Mime type
	 */
	private static Hashtable<String, String> getMap() {
		if (MAP == null) {
			MAP = new Hashtable<String, String>();
			MAP.put("3dm", "x-world/x-3dmf");
			MAP.put("3dmf", "x-world/x-3dmf");
			MAP.put("7z", "application/x-compressed");
			MAP.put("a", "application/octet-stream");
			MAP.put("aab", "application/x-authorware-bin");
			MAP.put("aam", "application/x-authorware-map");
			MAP.put("aas", "application/x-authorware-seg");
			MAP.put("abc", "text/vnd.abc");
			MAP.put("acgi", "text/html");
			MAP.put("afl", "video/animaflex");
			MAP.put("ai", "application/postscript");
			MAP.put("aif", "audio/aiff");
			MAP.put("aif", "audio/x-aiff");
			MAP.put("aifc", "audio/aiff");
			MAP.put("aifc", "audio/x-aiff");
			MAP.put("aiff", "audio/aiff");
			MAP.put("aiff", "audio/x-aiff");
			MAP.put("aim", "application/x-aim");
			MAP.put("aip", "text/x-audiosoft-intra");
			MAP.put("aks", "text/x-alkwarel-src");
			MAP.put("ani", "application/x-navi-animation");
			MAP.put("aos",
					"application/x-nokia-9000-communicator-add-on-software");
			MAP.put("aps", "application/mime");
			MAP.put("arc", "application/octet-stream");
			MAP.put("arj", "application/arj");
			MAP.put("arj", "application/octet-stream");
			MAP.put("art", "image/x-jg");
			MAP.put("asf", "video/x-ms-asf");
			MAP.put("asm", "text/x-asm");
			MAP.put("asp", "text/asp");
			MAP.put("asx", "application/x-mplayer2");
			MAP.put("asx", "video/x-ms-asf");
			MAP.put("asx", "video/x-ms-asf-plugin");
			MAP.put("au", "audio/basic");
			MAP.put("au", "audio/x-au");
			MAP.put("avi", "application/x-troff-msvideo");
			MAP.put("avi", "video/avi");
			MAP.put("avi", "video/msvideo");
			MAP.put("avi", "video/x-msvideo");
			MAP.put("avs", "video/avs-video");
			MAP.put("bcpio", "application/x-bcpio");
			MAP.put("bin", "application/mac-binary");
			MAP.put("bin", "application/macbinary");
			MAP.put("bin", "application/octet-stream");
			MAP.put("bin", "application/x-binary");
			MAP.put("bin", "application/x-macbinary");
			MAP.put("bm", "image/bmp");
			MAP.put("bmp", "image/bmp");
			MAP.put("bmp", "image/x-windows-bmp");
			MAP.put("boo", "application/book");
			MAP.put("book", "application/book");
			MAP.put("boz", "application/x-bzip2");
			MAP.put("bsh", "application/x-bsh");
			MAP.put("bz", "application/x-bzip");
			MAP.put("bz2", "application/x-bzip2");
			MAP.put("c", "text/plain");
			MAP.put("c", "text/x-c");
			MAP.put("c++", "text/plain");
			MAP.put("cat", "application/vnd.ms-pki.seccat");
			MAP.put("cc", "text/plain");
			MAP.put("cc", "text/x-c");
			MAP.put("ccad", "application/clariscad");
			MAP.put("cco", "application/x-cocoa");
			MAP.put("cdf", "application/cdf");
			MAP.put("cdf", "application/x-cdf");
			MAP.put("cdf", "application/x-netcdf");
			MAP.put("cer", "application/pkix-cert");
			MAP.put("cer", "application/x-x509-ca-cert");
			MAP.put("cha", "application/x-chat");
			MAP.put("chat", "application/x-chat");
			MAP.put("class", "application/java");
			MAP.put("class", "application/java-byte-code");
			MAP.put("class", "application/x-java-class");
			MAP.put("com", "application/octet-stream");
			MAP.put("com", "text/plain");
			MAP.put("conf", "text/plain");
			MAP.put("cpio", "application/x-cpio");
			MAP.put("cpp", "text/x-c");
			MAP.put("cpt", "application/mac-compactpro");
			MAP.put("cpt", "application/x-compactpro");
			MAP.put("cpt", "application/x-cpt");
			MAP.put("crl", "application/pkcs-crl");
			MAP.put("crl", "application/pkix-crl");
			MAP.put("crt", "application/pkix-cert");
			MAP.put("crt", "application/x-x509-ca-cert");
			MAP.put("crt", "application/x-x509-user-cert");
			MAP.put("csh", "application/x-csh");
			MAP.put("csh", "text/x-script.csh");
			MAP.put("css", "application/x-pointplus");
			MAP.put("css", "text/css");
			MAP.put("cxx", "text/plain");
			MAP.put("dcr", "application/x-director");
			MAP.put("db", "application/octet-stream");
			MAP.put("deepv", "application/x-deepv");
			MAP.put("def", "text/plain");
			MAP.put("der", "application/x-x509-ca-cert");
			MAP.put("dif", "video/x-dv");
			MAP.put("dir", "application/x-director");
			MAP.put("dl", "video/dl");
			MAP.put("dl", "video/x-dl");
			MAP.put("doc", "application/msword");
			MAP.put("dot", "application/msword");
			MAP.put("dp", "application/commonground");
			MAP.put("drw", "application/drafting");
			MAP.put("dtd", "application/xml-dtd");
			MAP.put("dump", "application/octet-stream");
			MAP.put("dv", "video/x-dv");
			MAP.put("dvi", "application/x-dvi");
			MAP.put("dwf", "drawing/x-dwf (old)");
			MAP.put("dwf", "model/vnd.dwf");
			MAP.put("dwg", "application/acad");
			MAP.put("dwg", "image/vnd.dwg");
			MAP.put("dwg", "image/x-dwg");
			MAP.put("dxf", "application/dxf");
			MAP.put("dxf", "image/vnd.dwg");
			MAP.put("dxf", "image/x-dwg");
			MAP.put("dxr", "application/x-director");
			MAP.put("el", "text/x-script.elisp");
			MAP.put("elc", "application/x-bytecode.elisp (compiled elisp)");
			MAP.put("elc", "application/x-elc");
			MAP.put("env", "application/x-envoy");
			MAP.put("eps", "application/postscript");
			MAP.put("es", "application/x-esrehber");
			MAP.put("etx", "text/x-setext");
			MAP.put("evy", "application/envoy");
			MAP.put("evy", "application/x-envoy");
			MAP.put("exe", "application/octet-stream");
			MAP.put("f", "text/plain");
			MAP.put("f", "text/x-fortran");
			MAP.put("f77", "text/x-fortran");
			MAP.put("f90", "text/plain");
			MAP.put("f90", "text/x-fortran");
			MAP.put("fdf", "application/vnd.fdf");
			MAP.put("fif", "application/fractals");
			MAP.put("fif", "image/fif");
			MAP.put("fli", "video/fli");
			MAP.put("fli", "video/x-fli");
			MAP.put("flo", "image/florian");
			MAP.put("flx", "text/vnd.fmi.flexstor");
			MAP.put("fmf", "video/x-atomic3d-feature");
			MAP.put("for", "text/plain");
			MAP.put("for", "text/x-fortran");
			MAP.put("fpx", "image/vnd.fpx");
			MAP.put("fpx", "image/vnd.net-fpx");
			MAP.put("frl", "application/freeloader");
			MAP.put("funk", "audio/make");
			MAP.put("g", "text/plain");
			MAP.put("g3", "image/g3fax");
			MAP.put("gif", "image/gif");
			MAP.put("gl", "video/gl");
			MAP.put("gl", "video/x-gl");
			MAP.put("gsd", "audio/x-gsm");
			MAP.put("gsm", "audio/x-gsm");
			MAP.put("gsp", "application/x-gsp");
			MAP.put("gss", "application/x-gss");
			MAP.put("gtar", "application/x-gtar");
			MAP.put("gz", "application/x-compressed");
			MAP.put("gzip", "application/x-compressed");
			MAP.put("h", "text/plain");
			MAP.put("h", "text/x-h");
			MAP.put("hdf", "application/x-hdf");
			MAP.put("help", "application/x-helpfile");
			MAP.put("hgl", "application/vnd.hp-hpgl");
			MAP.put("hh", "text/plain");
			MAP.put("hh", "text/x-h");
			MAP.put("hlb", "text/x-script");
			MAP.put("hlp", "application/hlp");
			MAP.put("hlp", "application/x-helpfile");
			MAP.put("hlp", "application/x-winhelp");
			MAP.put("hpg", "application/vnd.hp-hpgl");
			MAP.put("hpgl", "application/vnd.hp-hpgl");
			MAP.put("hqx", "application/binhex");
			MAP.put("hqx", "application/binhex4");
			MAP.put("hqx", "application/mac-binhex");
			MAP.put("hqx", "application/mac-binhex40");
			MAP.put("hqx", "application/x-binhex40");
			MAP.put("hqx", "application/x-mac-binhex40");
			MAP.put("hta", "application/hta");
			MAP.put("htc", "text/x-component");
			MAP.put("htm", "text/html");
			MAP.put("html", "text/html");
			MAP.put("htmls", "text/html");
			MAP.put("htt", "text/webviewhtml");
			MAP.put("htx", "text/html");
			MAP.put("ice", "x-conference/x-cooltalk");
			MAP.put("ico", "image/x-icon");
			MAP.put("idc", "text/plain");
			MAP.put("ief", "image/ief");
			MAP.put("iefs", "image/ief");
			MAP.put("iges", "application/iges");
			MAP.put("iges", "model/iges");
			MAP.put("igs", "application/iges");
			MAP.put("igs", "model/iges");
			MAP.put("ima", "application/x-ima");
			MAP.put("imap", "application/x-httpd-imap");
			MAP.put("inf", "application/inf");
			MAP.put("ins", "application/x-internett-signup");
			MAP.put("ip", "application/x-ip2");
			MAP.put("isu", "video/x-isvideo");
			MAP.put("it", "audio/it");
			MAP.put("iv", "application/x-inventor");
			MAP.put("ivr", "i-world/i-vrml");
			MAP.put("ivy", "application/x-livescreen");
			MAP.put("jam", "audio/x-jam");
			MAP.put("jar", "application/java-archive");
			MAP.put("jav", "text/plain");
			MAP.put("jav", "text/x-java-source");
			MAP.put("java", "text/plain");
			MAP.put("java", "text/x-java-source");
			MAP.put("jcm", "application/x-java-commerce");
			MAP.put("jfif", "image/jpeg");
			MAP.put("jfif", "image/pjpeg");
			MAP.put("jfif-tbnl", "image/jpeg");
			MAP.put("jpe", "image/jpeg");
			MAP.put("jpe", "image/pjpeg");
			MAP.put("jpeg", "image/jpeg");
			MAP.put("jpeg", "image/pjpeg");
			MAP.put("jpg", "image/jpeg");
			MAP.put("jpg", "image/pjpeg");
			MAP.put("jps", "image/x-jps");
			MAP.put("js", "application/x-javascript");
			MAP.put("jut", "image/jutvision");
			MAP.put("kar", "audio/midi");
			MAP.put("kar", "music/x-karaoke");
			MAP.put("ksh", "application/x-ksh");
			MAP.put("ksh", "text/x-script.ksh");
			MAP.put("la", "audio/nspaudio");
			MAP.put("la", "audio/x-nspaudio");
			MAP.put("lam", "audio/x-liveaudio");
			MAP.put("latex", "application/x-latex");
			MAP.put("lha", "application/lha");
			MAP.put("lha", "application/octet-stream");
			MAP.put("lha", "application/x-lha");
			MAP.put("lhx", "application/octet-stream");
			MAP.put("list", "text/plain");
			MAP.put("lma", "audio/nspaudio");
			MAP.put("lma", "audio/x-nspaudio");
			MAP.put("log", "text/plain");
			MAP.put("lsp", "application/x-lisp");
			MAP.put("lsp", "text/x-script.lisp");
			MAP.put("lst", "text/plain");
			MAP.put("lsx", "text/x-la-asf");
			MAP.put("ltx", "application/x-latex");
			MAP.put("lzh", "application/octet-stream");
			MAP.put("lzh", "application/x-lzh");
			MAP.put("lzx", "application/lzx");
			MAP.put("lzx", "application/octet-stream");
			MAP.put("lzx", "application/x-lzx");
			MAP.put("m", "text/plain");
			MAP.put("m", "text/x-m");
			MAP.put("m1v", "video/mpeg");
			MAP.put("m2a", "audio/mpeg");
			MAP.put("m2v", "video/mpeg");
			MAP.put("m3u", "audio/x-mpegurl");
			MAP.put("man", "application/x-troff-man");
			MAP.put("map", "application/x-navimap");
			MAP.put("mar", "text/plain");
			MAP.put("mbd", "application/mbedlet");
			MAP.put("mc$", "application/x-magic-cap-package-1.0");
			MAP.put("mcd", "application/mcad");
			MAP.put("mcd", "application/x-mathcad");
			MAP.put("mcf", "image/vasa");
			MAP.put("mcf", "text/mcf");
			MAP.put("mcp", "application/netmc");
			MAP.put("me", "application/x-troff-me");
			MAP.put("mht", "message/rfc822");
			MAP.put("mhtml", "message/rfc822");
			MAP.put("mid", "application/x-midi");
			MAP.put("mid", "audio/midi");
			MAP.put("mid", "audio/x-mid");
			MAP.put("mid", "audio/x-midi");
			MAP.put("mid", "music/crescendo");
			MAP.put("mid", "x-music/x-midi");
			MAP.put("midi", "application/x-midi");
			MAP.put("midi", "audio/midi");
			MAP.put("midi", "audio/x-mid");
			MAP.put("midi", "audio/x-midi");
			MAP.put("midi", "music/crescendo");
			MAP.put("midi", "x-music/x-midi");
			MAP.put("mif", "application/x-frame");
			MAP.put("mif", "application/x-mif");
			MAP.put("mime", "message/rfc822");
			MAP.put("mime", "www/mime");
			MAP.put("mjf", "audio/x-vnd.audioexplosion.mjuicemediafile");
			MAP.put("mjpg", "video/x-motion-jpeg");
			MAP.put("mm", "application/base64");
			MAP.put("mm", "application/x-meme");
			MAP.put("mme", "application/base64");
			MAP.put("mod", "audio/mod");
			MAP.put("mod", "audio/x-mod");
			MAP.put("moov", "video/quicktime");
			MAP.put("mov", "video/quicktime");
			MAP.put("movie", "video/x-sgi-movie");
			MAP.put("mp2", "audio/mpeg");
			MAP.put("mp2", "audio/x-mpeg");
			MAP.put("mp2", "video/mpeg");
			MAP.put("mp2", "video/x-mpeg");
			MAP.put("mp2", "video/x-mpeq2a");
			MAP.put("mp3", "audio/mpeg3");
			MAP.put("mp3", "audio/x-mpeg-3");
			MAP.put("mp3", "video/mpeg");
			MAP.put("mp3", "video/x-mpeg");
			MAP.put("mpa", "audio/mpeg");
			MAP.put("mpa", "video/mpeg");
			MAP.put("mpc", "application/x-project");
			MAP.put("mpe", "video/mpeg");
			MAP.put("mpeg", "video/mpeg");
			MAP.put("mpg", "audio/mpeg");
			MAP.put("mpg", "video/mpeg");
			MAP.put("mpga", "audio/mpeg");
			MAP.put("mpp", "application/vnd.ms-project");
			MAP.put("mpt", "application/x-project");
			MAP.put("mpv", "application/x-project");
			MAP.put("mpx", "application/x-project");
			MAP.put("mrc", "application/marc");
			MAP.put("ms", "application/x-troff-ms");
			MAP.put("mv", "video/x-sgi-movie");
			MAP.put("my", "audio/make");
			MAP.put("mzz", "application/x-vnd.audioexplosion.mzz");
			MAP.put("nap", "image/naplps");
			MAP.put("naplps", "image/naplps");
			MAP.put("nc", "application/x-netcdf");
			MAP.put("ncm", "application/vnd.nokia.configuration-message");
			MAP.put("nif", "image/x-niff");
			MAP.put("niff", "image/x-niff");
			MAP.put("nix", "application/x-mix-transfer");
			MAP.put("nsc", "application/x-conference");
			MAP.put("nvd", "application/x-navidoc");
			MAP.put("o", "application/octet-stream");
			MAP.put("oda", "application/oda");
			MAP.put("odb", "application/octet-stream");
			MAP.put("omc", "application/x-omc");
			MAP.put("omcd", "application/x-omcdatamaker");
			MAP.put("omcr", "application/x-omcregerator");
			MAP.put("p", "text/x-pascal");
			MAP.put("p10", "application/pkcs10");
			MAP.put("p10", "application/x-pkcs10");
			MAP.put("p12", "application/pkcs-12");
			MAP.put("p12", "application/x-pkcs12");
			MAP.put("p7a", "application/x-pkcs7-signature");
			MAP.put("p7c", "application/pkcs7-mime");
			MAP.put("p7c", "application/x-pkcs7-mime");
			MAP.put("p7m", "application/pkcs7-mime");
			MAP.put("p7m", "application/x-pkcs7-mime");
			MAP.put("p7r", "application/x-pkcs7-certreqresp");
			MAP.put("p7s", "application/pkcs7-signature");
			MAP.put("part", "application/pro_eng");
			MAP.put("pas", "text/pascal");
			MAP.put("pbm", "image/x-portable-bitmap");
			MAP.put("pcl", "application/vnd.hp-pcl");
			MAP.put("pcl", "application/x-pcl");
			MAP.put("pct", "image/x-pict");
			MAP.put("pcx", "image/x-pcx");
			MAP.put("pdb", "application/octet-stream");
			MAP.put("pdf", "application/pdf");
			MAP.put("pfunk", "audio/make");
			MAP.put("pfunk", "audio/make.my.funk");
			MAP.put("pgm", "image/x-portable-graymap");
			MAP.put("pgm", "image/x-portable-greymap");
			MAP.put("pic", "image/pict");
			MAP.put("pict", "image/pict");
			MAP.put("pkg", "application/x-newton-compatible-pkg");
			MAP.put("pko", "application/vnd.ms-pki.pko");
			MAP.put("pl", "text/plain");
			MAP.put("pl", "text/x-script.perl");
			MAP.put("plist", "text/xml");
			MAP.put("plx", "application/x-pixclscript");
			MAP.put("pm", "image/x-xpixmap");
			MAP.put("pm", "text/x-script.perl-module");
			MAP.put("pm4", "application/x-pagemaker");
			MAP.put("pm5", "application/x-pagemaker");
			MAP.put("png", "image/png");
			MAP.put("pnm", "application/x-portable-anymap");
			MAP.put("pnm", "image/x-portable-anymap");
			MAP.put("pot", "application/mspowerpoint");
			MAP.put("pot", "application/vnd.ms-powerpoint");
			MAP.put("pov", "model/x-pov");
			MAP.put("ppa", "application/vnd.ms-powerpoint");
			MAP.put("ppm", "image/x-portable-pixmap");
			MAP.put("pps", "application/mspowerpoint");
			MAP.put("pps", "application/vnd.ms-powerpoint");
			MAP.put("ppt", "application/mspowerpoint");
			MAP.put("ppt", "application/powerpoint");
			MAP.put("ppt", "application/vnd.ms-powerpoint");
			MAP.put("ppt", "application/x-mspowerpoint");
			MAP.put("ppz", "application/mspowerpoint");
			MAP.put("pre", "application/x-freelance");
			MAP.put("prt", "application/pro_eng");
			MAP.put("ps", "application/postscript");
			MAP.put("psd", "application/octet-stream");
			MAP.put("pvu", "paleovu/x-pv");
			MAP.put("pwz", "application/vnd.ms-powerpoint");
			MAP.put("py", "text/x-script.phyton");
			MAP.put("pyc", "application/x-bytecode.python");
			MAP.put("qcp", "audio/vnd.qcelp");
			MAP.put("qd3", "x-world/x-3dmf");
			MAP.put("qd3d", "x-world/x-3dmf");
			MAP.put("qif", "image/x-quicktime");
			MAP.put("qt", "video/quicktime");
			MAP.put("qtc", "video/x-qtc");
			MAP.put("qti", "image/x-quicktime");
			MAP.put("qtif", "image/x-quicktime");
			MAP.put("ra", "audio/x-pn-realaudio");
			MAP.put("ra", "audio/x-pn-realaudio-plugin");
			MAP.put("ra", "audio/x-realaudio");
			MAP.put("ram", "audio/x-pn-realaudio");
			MAP.put("ras", "application/x-cmu-raster");
			MAP.put("ras", "image/cmu-raster");
			MAP.put("ras", "image/x-cmu-raster");
			MAP.put("rast", "image/cmu-raster");
			MAP.put("rexx", "text/x-script.rexx");
			MAP.put("rf", "image/vnd.rn-realflash");
			MAP.put("rgb", "image/x-rgb");
			MAP.put("rm", "application/vnd.rn-realmedia");
			MAP.put("rm", "audio/x-pn-realaudio");
			MAP.put("rmi", "audio/mid");
			MAP.put("rmm", "audio/x-pn-realaudio");
			MAP.put("rmp", "audio/x-pn-realaudio");
			MAP.put("rmp", "audio/x-pn-realaudio-plugin");
			MAP.put("rng", "application/ringing-tones");
			MAP.put("rng", "application/vnd.nokia.ringing-tone");
			MAP.put("rnx", "application/vnd.rn-realplayer");
			MAP.put("roff", "application/x-troff");
			MAP.put("rp", "image/vnd.rn-realpix");
			MAP.put("rpm", "audio/x-pn-realaudio-plugin");
			MAP.put("rt", "text/richtext");
			MAP.put("rt", "text/vnd.rn-realtext");
			MAP.put("rtf", "application/rtf");
			MAP.put("rtf", "application/x-rtf");
			MAP.put("rtf", "text/richtext");
			MAP.put("rtx", "application/rtf");
			MAP.put("rtx", "text/richtext");
			MAP.put("rv", "video/vnd.rn-realvideo");
			MAP.put("s", "text/x-asm");
			MAP.put("s3m", "audio/s3m");
			MAP.put("saveme", "application/octet-stream");
			MAP.put("sbk", "application/x-tbook");
			MAP.put("scm", "application/x-lotusscreencam");
			MAP.put("scm", "text/x-script.guile");
			MAP.put("scm", "text/x-script.scheme");
			MAP.put("scm", "video/x-scm");
			MAP.put("sdml", "text/plain");
			MAP.put("sdp", "application/sdp");
			MAP.put("sdp", "application/x-sdp");
			MAP.put("sdr", "application/sounder");
			MAP.put("sea", "application/sea");
			MAP.put("sea", "application/x-sea");
			MAP.put("set", "application/set");
			MAP.put("sgm", "text/sgml");
			MAP.put("sgm", "text/x-sgml");
			MAP.put("sgml", "text/sgml");
			MAP.put("sgml", "text/x-sgml");
			MAP.put("sh", "application/x-bsh");
			MAP.put("sh", "application/x-sh");
			MAP.put("sh", "application/x-shar");
			MAP.put("sh", "text/x-script.sh");
			MAP.put("shar", "application/x-bsh");
			MAP.put("shar", "application/x-shar");
			MAP.put("shtml", "text/html");
			MAP.put("shtml", "text/x-server-parsed-html");
			MAP.put("sid", "audio/x-psid");
			MAP.put("sit", "application/x-sit");
			MAP.put("sit", "application/x-stuffit");
			MAP.put("skd", "application/x-koan");
			MAP.put("skm", "application/x-koan");
			MAP.put("skp", "application/x-koan");
			MAP.put("skt", "application/x-koan");
			MAP.put("sl", "application/x-seelogo");
			MAP.put("smi", "application/smil");
			MAP.put("smil", "application/smil");
			MAP.put("snd", "audio/basic");
			MAP.put("snd", "audio/x-adpcm");
			MAP.put("sol", "application/solids");
			MAP.put("spc", "application/x-pkcs7-certificates");
			MAP.put("spc", "text/x-speech");
			MAP.put("spl", "application/futuresplash");
			MAP.put("spr", "application/x-sprite");
			MAP.put("sprite", "application/x-sprite");
			MAP.put("src", "application/x-wais-source");
			MAP.put("ssi", "text/x-server-parsed-html");
			MAP.put("ssm", "application/streamingmedia");
			MAP.put("sst", "application/vnd.ms-pki.certstore");
			MAP.put("step", "application/step");
			MAP.put("stl", "application/sla");
			MAP.put("stl", "application/vnd.ms-pki.stl");
			MAP.put("stl", "application/x-navistyle");
			MAP.put("stp", "application/step");
			MAP.put("sv4cpio", "application/x-sv4cpio");
			MAP.put("sv4crc", "application/x-sv4crc");
			MAP.put("svf", "image/vnd.dwg");
			MAP.put("svf", "image/x-dwg");
			MAP.put("svr", "application/x-world");
			MAP.put("svr", "x-world/x-svr");
			MAP.put("swf", "application/x-shockwave-flash");
			MAP.put("t", "application/x-troff");
			MAP.put("talk", "text/x-speech");
			MAP.put("", "application/x-tar");
			MAP.put("tbk", "application/toolbook");
			MAP.put("tbk", "application/x-tbook");
			MAP.put("tcl", "application/x-tcl");
			MAP.put("tcl", "text/x-script.tcl");
			MAP.put("tcsh", "text/x-script.tcsh");
			MAP.put("tex", "application/x-tex");
			MAP.put("texi", "application/x-texinfo");
			MAP.put("texinfo", "application/x-texinfo");
			MAP.put("text", "application/plain");
			MAP.put("text", "text/plain");
			MAP.put("tgz", "application/gnutar");
			MAP.put("tgz", "application/x-compressed");
			MAP.put("tif", "image/tiff");
			MAP.put("tif", "image/x-tiff");
			MAP.put("tiff", "image/tiff");
			MAP.put("tiff", "image/x-tiff");
			MAP.put("tr", "application/x-troff");
			MAP.put("tsi", "audio/tsp-audio");
			MAP.put("tsp", "application/dsptype");
			MAP.put("tsp", "audio/tsplayer");
			MAP.put("tsv", "text/tab-separated-values");
			MAP.put("turbot", "image/florian");
			MAP.put("txt", "text/plain");
			MAP.put("uil", "text/x-uil");
			MAP.put("uni", "text/uri-list");
			MAP.put("unis", "text/uri-list");
			MAP.put("unv", "application/i-deas");
			MAP.put("uri", "text/uri-list");
			MAP.put("uris", "text/uri-list");
			MAP.put("ustar", "application/x-ustar");
			MAP.put("ustar", "multipart/x-ustar");
			MAP.put("uu", "application/octet-stream");
			MAP.put("uu", "text/x-uuencode");
			MAP.put("uue", "text/x-uuencode");
			MAP.put("vcd", "application/x-cdlink");
			MAP.put("vcs", "text/x-vcalendar");
			MAP.put("vda", "application/vda");
			MAP.put("vdo", "video/vdo");
			MAP.put("vew", "application/groupwise");
			MAP.put("viv", "video/vivo");
			MAP.put("viv", "video/vnd.vivo");
			MAP.put("vivo", "video/vivo");
			MAP.put("vivo", "video/vnd.vivo");
			MAP.put("vmd", "application/vocaltec-media-desc");
			MAP.put("vmf", "application/vocaltec-media-file");
			MAP.put("voc", "audio/voc");
			MAP.put("voc", "audio/x-voc");
			MAP.put("vos", "video/vosaic");
			MAP.put("vox", "audio/voxware");
			MAP.put("vqe", "audio/x-twinvq-plugin");
			MAP.put("vqf", "audio/x-twinvq");
			MAP.put("vql", "audio/x-twinvq-plugin");
			MAP.put("vrml", "application/x-vrml");
			MAP.put("vrml", "model/vrml");
			MAP.put("vrml", "x-world/x-vrml");
			MAP.put("vrt", "x-world/x-vrt");
			MAP.put("vsd", "application/x-visio");
			MAP.put("vst", "application/x-visio");
			MAP.put("vsw", "application/x-visio");
			MAP.put("w60", "application/wordperfect6.0");
			MAP.put("w61", "application/wordperfect6.1");
			MAP.put("w6w", "application/msword");
			MAP.put("wav", "audio/wav");
			MAP.put("wav", "audio/x-wav");
			MAP.put("wb1", "application/x-qpro");
			MAP.put("wbmp", "image/vnd.wap.wbmp");
			MAP.put("web", "application/vnd.xara");
			MAP.put("wiz", "application/msword");
			MAP.put("wk1", "application/x-123");
			MAP.put("wmf", "windows/metafile");
			MAP.put("wml", "text/vnd.wap.wml");
			MAP.put("wmlc", "application/vnd.wap.wmlc");
			MAP.put("wmls", "text/vnd.wap.wmlscript");
			MAP.put("wmlsc", "application/vnd.wap.wmlscriptc");
			MAP.put("word", "application/msword");
			MAP.put("wp", "application/wordperfect");
			MAP.put("wp5", "application/wordperfect");
			MAP.put("wp5", "application/wordperfect6.0");
			MAP.put("wp6", "application/wordperfect");
			MAP.put("wpd", "application/wordperfect");
			MAP.put("wpd", "application/x-wpwin");
			MAP.put("wq1", "application/x-lotus");
			MAP.put("wri", "application/mswrite");
			MAP.put("wri", "application/x-wri");
			MAP.put("wrl", "application/x-world");
			MAP.put("wrl", "model/vrml");
			MAP.put("wrl", "x-world/x-vrml");
			MAP.put("wrz", "model/vrml");
			MAP.put("wrz", "x-world/x-vrml");
			MAP.put("wsc", "text/scriplet");
			MAP.put("wsrc", "application/x-wais-source");
			MAP.put("wtk", "application/x-wintalk");
			MAP.put("xbm", "image/x-xbitmap");
			MAP.put("xbm", "image/x-xbm");
			MAP.put("xbm", "image/xbm");
			MAP.put("xdr", "video/x-amt-demorun");
			MAP.put("xgz", "xgl/drawing");
			MAP.put("xif", "image/vnd.xiff");
			MAP.put("xl", "application/excel");
			MAP.put("xla", "application/excel");
			MAP.put("xla", "application/x-excel");
			MAP.put("xla", "application/x-msexcel");
			MAP.put("xlb", "application/excel");
			MAP.put("xlb", "application/vnd.ms-excel");
			MAP.put("xlb", "application/x-excel");
			MAP.put("xlc", "application/excel");
			MAP.put("xlc", "application/vnd.ms-excel");
			MAP.put("xlc", "application/x-excel");
			MAP.put("xld", "application/excel");
			MAP.put("xld", "application/x-excel");
			MAP.put("xlk", "application/excel");
			MAP.put("xlk", "application/x-excel");
			MAP.put("xll", "application/excel");
			MAP.put("xll", "application/vnd.ms-excel");
			MAP.put("xll", "application/x-excel");
			MAP.put("xlm", "application/excel");
			MAP.put("xlm", "application/vnd.ms-excel");
			MAP.put("xlm", "application/x-excel");
			MAP.put("xls", "application/excel");
			MAP.put("xls", "application/vnd.ms-excel");
			MAP.put("xls", "application/x-excel");
			MAP.put("xls", "application/x-msexcel");
			MAP.put("xlt", "application/excel");
			MAP.put("xlt", "application/x-excel");
			MAP.put("xlv", "application/excel");
			MAP.put("xlv", "application/x-excel");
			MAP.put("xlw", "application/excel");
			MAP.put("xlw", "application/vnd.ms-excel");
			MAP.put("xlw", "application/x-excel");
			MAP.put("xlw", "application/x-msexcel");
			MAP.put("xm", "audio/xm");
			MAP.put("xml", "application/xml");
			MAP.put("xml", "text/xml");
			MAP.put("xsd", "application/xml");
			MAP.put("xsd", "text/xml");
			MAP.put("xmz", "xgl/movie");
			MAP.put("xpix", "application/x-vnd.ls-xpix");
			MAP.put("xpm", "image/x-xpixmap");
			MAP.put("xpm", "image/xpm");
			MAP.put("x-png", "image/png");
			MAP.put("xsr", "video/x-amt-showrun");
			MAP.put("xwd", "image/x-xwd");
			MAP.put("xwd", "image/x-xwindowdump");
			MAP.put("xyz", "chemical/x-pdb");
			MAP.put("z", "application/x-compress");
			MAP.put("z", "application/x-compressed");
			MAP.put("zip", "application/x-compressed");
			MAP.put("zoo", "application/octet-stream");
			MAP.put("zsh", "text/x-script.zsh");
		}
		return MAP;
	}

	/**
	 * @param ext
	 *            the extension
	 * @return the mime type
	 */
	public static String getMimeTypeFromExtension(String ext) {
		return getMap().get(ext);
	}

	/** map */
	private static Hashtable<String, String> MAP;
}
