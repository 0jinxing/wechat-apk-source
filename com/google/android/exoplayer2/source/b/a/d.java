package com.google.android.exoplayer2.source.b.a;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.t.a;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.o;
import com.google.android.exoplayer2.source.q;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d
  implements t.a<c>
{
  private static final Pattern bkb;
  private static final Pattern bkc;
  private static final Pattern bkd;
  private static final Pattern bke;
  private static final Pattern bkf;
  private static final Pattern bkg;
  private static final Pattern bkh;
  private static final Pattern bki;
  private static final Pattern bkj;
  private static final Pattern bkk;
  private static final Pattern bkl;
  private static final Pattern bkm;
  private static final Pattern bkn;
  private static final Pattern bko;
  private static final Pattern bkp;
  private static final Pattern bkq;
  private static final Pattern bkr;
  private static final Pattern bks;
  private static final Pattern bkt;
  private static final Pattern bku;
  private static final Pattern bkv;
  private static final Pattern bkw;

  static
  {
    AppMethodBeat.i(125979);
    bkb = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    bkc = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    bkd = Pattern.compile("CODECS=\"(.+?)\"");
    bke = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    bkf = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    bkg = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    bkh = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    bki = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    bkj = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    bkk = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    bkl = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    bkm = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    bkn = Pattern.compile("METHOD=(NONE|AES-128)");
    bko = Pattern.compile("URI=\"(.+?)\"");
    bkp = Pattern.compile("IV=([^,.*]+)");
    bkq = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    bkr = Pattern.compile("LANGUAGE=\"(.+?)\"");
    bks = Pattern.compile("NAME=\"(.+?)\"");
    bkt = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    bku = az("AUTOSELECT");
    bkv = az("DEFAULT");
    bkw = az("FORCED");
    AppMethodBeat.o(125979);
  }

  private static int a(BufferedReader paramBufferedReader, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(125969);
    while ((paramInt != -1) && (Character.isWhitespace(paramInt)) && ((paramBoolean) || (!v.eQ(paramInt))))
      paramInt = paramBufferedReader.read();
    AppMethodBeat.o(125969);
    return paramInt;
  }

  private static int a(String paramString, Pattern paramPattern)
  {
    AppMethodBeat.i(125972);
    int i = Integer.parseInt(d(paramString, paramPattern));
    AppMethodBeat.o(125972);
    return i;
  }

  private static a a(d.a parama, String paramString)
  {
    AppMethodBeat.i(125970);
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    Object localObject1 = null;
    Object localObject2 = null;
    int i = 0;
    while (parama.hasNext())
    {
      Object localObject3 = parama.next();
      com.google.android.exoplayer2.d.b.i("master ExoPlayer", (String)localObject3, new Object[0]);
      if (((String)localObject3).startsWith("#EXT"))
        localArrayList4.add(localObject3);
      int j;
      label123: int k;
      label137: int m;
      label151: Object localObject4;
      String str2;
      if (((String)localObject3).startsWith("#EXT-X-MEDIA"))
      {
        String str1;
        String str3;
        if (e((String)localObject3, bkv))
        {
          j = 1;
          if (!e((String)localObject3, bkw))
            break label306;
          k = 2;
          if (!e((String)localObject3, bku))
            break label312;
          m = 4;
          k = k | j | m;
          localObject4 = c((String)localObject3, bko);
          str1 = d((String)localObject3, bks);
          str2 = c((String)localObject3, bkr);
          str3 = d((String)localObject3, bkq);
          j = -1;
          switch (str3.hashCode())
          {
          default:
          case 62628790:
          case -959297733:
          case -333210994:
          }
        }
        while (true)
          switch (j)
          {
          default:
            break;
          case 0:
            localObject3 = Format.a(str1, "application/x-mpegURL", k, str2);
            if (localObject4 != null)
              break label366;
            localObject1 = localObject3;
            break;
            j = 0;
            break label123;
            label306: k = 0;
            break label137;
            label312: m = 0;
            break label151;
            if (str3.equals("AUDIO"))
            {
              j = 0;
              continue;
              if (str3.equals("SUBTITLES"))
              {
                j = 1;
                continue;
                if (str3.equals("CLOSED-CAPTIONS"))
                  j = 2;
              }
            }
            break;
          case 1:
          case 2:
          }
        label366: localArrayList2.add(new a.a((String)localObject4, (Format)localObject3));
        continue;
        localArrayList3.add(new a.a((String)localObject4, Format.a(str1, "application/x-mpegURL", "text/vtt", k, str2)));
        continue;
        localObject4 = d((String)localObject3, bkt);
        if (((String)localObject4).startsWith("CC"))
          localObject3 = "application/cea-608";
        for (j = Integer.parseInt(((String)localObject4).substring(2)); ; j = Integer.parseInt(((String)localObject4).substring(7)))
        {
          localObject4 = localObject2;
          if (localObject2 == null)
            localObject4 = new ArrayList();
          ((List)localObject4).add(Format.a(str1, null, (String)localObject3, k, str2, j));
          localObject2 = localObject4;
          break;
          localObject3 = "application/cea-708";
        }
      }
      else if (((String)localObject3).startsWith("#EXT-X-STREAM-INF"))
      {
        k = a((String)localObject3, bkc);
        localObject4 = c((String)localObject3, bkb);
        if (localObject4 != null)
          k = Integer.parseInt((String)localObject4);
        localObject4 = c((String)localObject3, bkd);
        str2 = c((String)localObject3, bke);
        int n = i | ((String)localObject3).contains("CLOSED-CAPTIONS=NONE");
        if (str2 != null)
        {
          localObject3 = str2.split("x");
          j = Integer.parseInt(localObject3[0]);
          m = Integer.parseInt(localObject3[1]);
          if (j > 0)
          {
            i = m;
            if (m > 0);
          }
          else
          {
            j = -1;
            i = -1;
          }
          m = j;
        }
        for (j = i; ; j = -1)
        {
          localObject3 = parama.next();
          i = n;
          if (!localHashSet.add(localObject3))
            break;
          localArrayList1.add(new a.a((String)localObject3, Format.a(Integer.toString(localArrayList1.size()), "application/x-mpegURL", (String)localObject4, k, m, j)));
          i = n;
          break;
          m = -1;
        }
      }
    }
    if (i != 0)
      localObject2 = Collections.emptyList();
    parama = new a(paramString, localArrayList4, localArrayList1, localArrayList2, localArrayList3, localObject1, (List)localObject2);
    AppMethodBeat.o(125970);
    return parama;
  }

  private static c a(Uri paramUri, InputStream paramInputStream)
  {
    AppMethodBeat.i(125967);
    paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream));
    Object localObject1 = new LinkedList();
    try
    {
      if (a(paramInputStream))
        break label105;
      com.google.android.exoplayer2.d.b.e("ExoPlayer", "parse, not the #EXTM3U header, uri:%s, reader:%s", new Object[] { paramUri.toString(), paramInputStream.readLine() });
      localObject1 = new com/google/android/exoplayer2/source/q;
      ((q)localObject1).<init>("Input does not start with the #EXTM3U header.", paramUri);
      AppMethodBeat.o(125967);
      throw ((Throwable)localObject1);
    }
    finally
    {
      v.closeQuietly(paramInputStream);
      AppMethodBeat.o(125967);
    }
    Object localObject2;
    ((Queue)localObject1).add(localObject2);
    label105: 
    do
    {
      localObject2 = paramInputStream.readLine();
      if (localObject2 == null)
        break;
      localObject2 = ((String)localObject2).trim();
    }
    while (((String)localObject2).isEmpty());
    if (((String)localObject2).startsWith("#EXT-X-STREAM-INF"))
    {
      ((Queue)localObject1).add(localObject2);
      localObject2 = new com/google/android/exoplayer2/source/b/a/d$a;
      ((d.a)localObject2).<init>((Queue)localObject1, paramInputStream);
      paramUri = a((d.a)localObject2, paramUri.toString());
      v.closeQuietly(paramInputStream);
      AppMethodBeat.o(125967);
    }
    while (true)
    {
      return paramUri;
      if ((!((String)localObject2).startsWith("#EXT-X-TARGETDURATION")) && (!((String)localObject2).startsWith("#EXT-X-MEDIA-SEQUENCE")) && (!((String)localObject2).startsWith("#EXTINF")) && (!((String)localObject2).startsWith("#EXT-X-KEY")) && (!((String)localObject2).startsWith("#EXT-X-BYTERANGE")) && (!((String)localObject2).equals("#EXT-X-DISCONTINUITY")) && (!((String)localObject2).equals("#EXT-X-DISCONTINUITY-SEQUENCE")) && (!((String)localObject2).equals("#EXT-X-ENDLIST")))
        break;
      ((Queue)localObject1).add(localObject2);
      localObject2 = new com/google/android/exoplayer2/source/b/a/d$a;
      ((d.a)localObject2).<init>((Queue)localObject1, paramInputStream);
      paramUri = b((d.a)localObject2, paramUri.toString());
      v.closeQuietly(paramInputStream);
      AppMethodBeat.o(125967);
    }
    v.closeQuietly(paramInputStream);
    paramUri = new o("Failed to parse the playlist, could not identify any tags.");
    AppMethodBeat.o(125967);
    throw paramUri;
  }

  private static boolean a(BufferedReader paramBufferedReader)
  {
    AppMethodBeat.i(125968);
    int i = paramBufferedReader.read();
    int j = i;
    boolean bool;
    if (i == 239)
      if ((paramBufferedReader.read() != 187) || (paramBufferedReader.read() != 191))
      {
        AppMethodBeat.o(125968);
        bool = false;
      }
    while (true)
    {
      return bool;
      j = paramBufferedReader.read();
      j = a(paramBufferedReader, true, j);
      for (i = 0; ; i++)
      {
        if (i >= 7)
          break label103;
        if (j != "#EXTM3U".charAt(i))
        {
          AppMethodBeat.o(125968);
          bool = false;
          break;
        }
        j = paramBufferedReader.read();
      }
      label103: bool = v.eQ(a(paramBufferedReader, false, j));
      AppMethodBeat.o(125968);
    }
  }

  private static Pattern az(String paramString)
  {
    AppMethodBeat.i(125977);
    paramString = Pattern.compile(paramString + "=(NO|YES)");
    AppMethodBeat.o(125977);
    return paramString;
  }

  private static double b(String paramString, Pattern paramPattern)
  {
    AppMethodBeat.i(125973);
    double d = Double.parseDouble(d(paramString, paramPattern));
    AppMethodBeat.o(125973);
    return d;
  }

  private static b b(d.a parama, String paramString)
  {
    AppMethodBeat.i(125971);
    int i = 0;
    long l1 = -9223372036854775807L;
    int j = 0;
    int k = 1;
    long l2 = -9223372036854775807L;
    boolean bool1 = false;
    boolean bool2 = false;
    Object localObject1 = null;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    long l3 = 0L;
    boolean bool3 = false;
    long l4 = 0L;
    long l5 = -1L;
    boolean bool4 = false;
    String str1 = null;
    String str2 = null;
    int m = 0;
    long l6 = 0L;
    long l7 = 0L;
    int n = 0;
    int i1 = 0;
    long l8;
    String str3;
    Object localObject2;
    while (true)
    {
      l8 = l3;
      if (!parama.hasNext())
        break label880;
      str3 = parama.next();
      com.google.android.exoplayer2.d.b.i("ExoPlayer", str3, new Object[0]);
      if (str3.startsWith("#EXT"))
        localArrayList2.add(str3);
      if (!str3.startsWith("#EXT-X-PLAYLIST-TYPE"))
        break label198;
      localObject2 = d(str3, bkh);
      if (!"VOD".equals(localObject2))
        break;
      i = 1;
      l3 = l8;
    }
    if ("EVENT".equals(localObject2))
      i = 2;
    while (true)
    {
      l3 = l8;
      break;
      label198: if (str3.startsWith("#EXT-X-START"))
      {
        l1 = ()(b(str3, bkk) * 1000000.0D);
        l3 = l8;
        break;
      }
      if (str3.startsWith("#EXT-X-MAP"))
      {
        localObject2 = d(str3, bko);
        localObject1 = c(str3, bkm);
        if (localObject1 == null)
          break label948;
        localObject1 = ((String)localObject1).split("@");
        l3 = Long.parseLong(localObject1[0]);
        l5 = l4;
        l4 = l3;
        if (localObject1.length > 1)
          l5 = Long.parseLong(localObject1[1]);
      }
      for (l4 = l3; ; l4 = l3)
      {
        localObject1 = new b.a((String)localObject2, l5, l4);
        l4 = 0L;
        l5 = -1L;
        l3 = l8;
        break;
        if (str3.startsWith("#EXT-X-TARGETDURATION"))
        {
          l2 = a(str3, bkf) * 1000000L;
          l3 = l8;
          break;
        }
        if (str3.startsWith("#EXT-X-MEDIA-SEQUENCE"))
        {
          j = a(str3, bki);
          m = j;
          l3 = l8;
          break;
        }
        if (str3.startsWith("#EXT-X-VERSION"))
        {
          k = a(str3, bkg);
          l3 = l8;
          break;
        }
        if (str3.startsWith("#EXTINF"))
        {
          l3 = ()(b(str3, bkj) * 1000000.0D);
          break;
        }
        if (str3.startsWith("#EXT-X-KEY"))
        {
          bool4 = "AES-128".equals(d(str3, bkn));
          if (bool4)
          {
            str1 = d(str3, bko);
            str2 = c(str3, bkp);
            l3 = l8;
            break;
          }
          str1 = null;
          str2 = null;
          l3 = l8;
          break;
        }
        if (str3.startsWith("#EXT-X-BYTERANGE"))
        {
          localObject2 = d(str3, bkl).split("@");
          l5 = Long.parseLong(localObject2[0]);
          if (localObject2.length <= 1)
            break label945;
          l4 = Long.parseLong(localObject2[1]);
        }
        label942: label945: 
        while (true)
        {
          l3 = l8;
          break;
          if (str3.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE"))
          {
            i1 = Integer.parseInt(str3.substring(str3.indexOf(':') + 1));
            bool3 = true;
            l3 = l8;
            break;
          }
          if (str3.equals("#EXT-X-DISCONTINUITY"))
          {
            n++;
            l3 = l8;
            break;
          }
          if (str3.startsWith("#EXT-X-PROGRAM-DATE-TIME"))
          {
            l3 = l8;
            if (l7 != 0L)
              break;
            l7 = com.google.android.exoplayer2.b.x(v.aS(str3.substring(str3.indexOf(':') + 1))) - l6;
            l3 = l8;
            break;
          }
          if (!str3.startsWith("#"))
            if (!bool4)
            {
              localObject2 = null;
              label730: if (l5 != -1L)
                break label942;
              l4 = 0L;
            }
          while (true)
          {
            localArrayList1.add(new b.a(str3, l8, n, l6, bool4, str1, (String)localObject2, l4, l5));
            l3 = 0L;
            if (l5 != -1L)
              l4 += l5;
            while (true)
            {
              l5 = -1L;
              m++;
              l6 += l8;
              break;
              if (str2 != null)
              {
                localObject2 = str2;
                break label730;
              }
              localObject2 = Integer.toHexString(m);
              break label730;
              if (str3.equals("#EXT-X-INDEPENDENT-SEGMENTS"))
              {
                bool1 = true;
                l3 = l8;
                break;
              }
              l3 = l8;
              if (!str3.equals("#EXT-X-ENDLIST"))
                break;
              bool2 = true;
              l3 = l8;
              break;
              label880: if (l7 != 0L);
              for (bool4 = true; ; bool4 = false)
              {
                parama = new b(i, paramString, localArrayList2, l1, l7, bool3, i1, j, k, l2, bool1, bool2, bool4, (b.a)localObject1, localArrayList1);
                AppMethodBeat.o(125971);
                return parama;
              }
            }
          }
        }
        label948: l3 = l5;
        l5 = l4;
      }
    }
  }

  private static String c(String paramString, Pattern paramPattern)
  {
    AppMethodBeat.i(125974);
    paramString = paramPattern.matcher(paramString);
    if (paramString.find())
    {
      paramString = paramString.group(1);
      AppMethodBeat.o(125974);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(125974);
    }
  }

  private static String d(String paramString, Pattern paramPattern)
  {
    AppMethodBeat.i(125975);
    Matcher localMatcher = paramPattern.matcher(paramString);
    if ((localMatcher.find()) && (localMatcher.groupCount() == 1))
    {
      paramString = localMatcher.group(1);
      AppMethodBeat.o(125975);
      return paramString;
    }
    paramString = new o("Couldn't match " + paramPattern.pattern() + " in " + paramString);
    AppMethodBeat.o(125975);
    throw paramString;
  }

  private static boolean e(String paramString, Pattern paramPattern)
  {
    AppMethodBeat.i(125976);
    paramString = paramPattern.matcher(paramString);
    boolean bool;
    if (paramString.find())
    {
      bool = paramString.group(1).equals("YES");
      AppMethodBeat.o(125976);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(125976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.a.d
 * JD-Core Version:    0.6.2
 */