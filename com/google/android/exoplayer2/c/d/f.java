package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class f
{
  private static final int aYD;
  private static final int aYE;
  private static final int aYF;
  private static final int aYG;
  private static final int aYH;
  private static final int aYI;
  private static final int aYJ;
  private static final int aYK;
  private static final int aYL;
  private static final int aYM;
  private static final int aYN;
  private static final int aYO;
  private static final int aYP;
  private static final int aYQ;
  private static final int aYR;
  private static final int aYS;
  private static final int aYT;
  private static final int aYU;
  private static final int aYV;
  private static final int aYW;
  private static final int aYX;
  private static final int aYY;
  private static final int aYZ;
  private static final int aZa;
  private static final int aZb;
  private static final int aZc;
  private static final int aZd;
  private static final int aZe;
  private static final int aZf;
  private static final String[] aZg;

  static
  {
    AppMethodBeat.i(94996);
    aYD = v.aT("nam");
    aYE = v.aT("trk");
    aYF = v.aT("cmt");
    aYG = v.aT("day");
    aYH = v.aT("ART");
    aYI = v.aT("too");
    aYJ = v.aT("alb");
    aYK = v.aT("com");
    aYL = v.aT("wrt");
    aYM = v.aT("lyr");
    aYN = v.aT("gen");
    aYO = v.aT("covr");
    aYP = v.aT("gnre");
    aYQ = v.aT("grp");
    aYR = v.aT("disk");
    aYS = v.aT("trkn");
    aYT = v.aT("tmpo");
    aYU = v.aT("cpil");
    aYV = v.aT("aART");
    aYW = v.aT("sonm");
    aYX = v.aT("soal");
    aYY = v.aT("soar");
    aYZ = v.aT("soaa");
    aZa = v.aT("soco");
    aZb = v.aT("rtng");
    aZc = v.aT("pgap");
    aZd = v.aT("sosn");
    aZe = v.aT("tvsh");
    aZf = v.aT("----");
    aZg = new String[] { "Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop" };
    AppMethodBeat.o(94996);
  }

  private static Id3Frame a(int paramInt, String paramString, l paraml, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(94992);
    int i = p(paraml);
    if (paramBoolean2)
      i = Math.min(1, i);
    while (true)
    {
      if (i >= 0)
        if (paramBoolean1)
        {
          paramString = new TextInformationFrame(paramString, null, Integer.toString(i));
          AppMethodBeat.o(94992);
        }
      while (true)
      {
        return paramString;
        paramString = new CommentFrame("und", paramString, Integer.toString(i));
        AppMethodBeat.o(94992);
        continue;
        new StringBuilder("Failed to parse uint8 attribute: ").append(a.dV(paramInt));
        AppMethodBeat.o(94992);
        paramString = null;
      }
    }
  }

  private static TextInformationFrame a(int paramInt, String paramString, l paraml)
  {
    AppMethodBeat.i(94991);
    int i = paraml.readInt();
    if (paraml.readInt() == a.aXm)
    {
      paraml.eM(8);
      paramString = new TextInformationFrame(paramString, null, paraml.eN(i - 16));
      AppMethodBeat.o(94991);
    }
    while (true)
    {
      return paramString;
      new StringBuilder("Failed to parse text attribute: ").append(a.dV(paramInt));
      AppMethodBeat.o(94991);
      paramString = null;
    }
  }

  private static TextInformationFrame b(int paramInt, String paramString, l paraml)
  {
    AppMethodBeat.i(94993);
    int i = paraml.readInt();
    if ((paraml.readInt() == a.aXm) && (i >= 22))
    {
      paraml.eM(10);
      i = paraml.readUnsignedShort();
      if (i > 0)
      {
        String str = String.valueOf(i);
        paramInt = paraml.readUnsignedShort();
        paraml = str;
        if (paramInt > 0)
          paraml = str + "/" + paramInt;
        paramString = new TextInformationFrame(paramString, null, paraml);
        AppMethodBeat.o(94993);
      }
    }
    while (true)
    {
      return paramString;
      new StringBuilder("Failed to parse index/count attribute: ").append(a.dV(paramInt));
      AppMethodBeat.o(94993);
      paramString = null;
    }
  }

  private static Id3Frame d(l paraml, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(94994);
    int i = -1;
    int j = -1;
    String str1 = null;
    String str2 = null;
    while (paraml.position < paramInt)
    {
      int k = paraml.position;
      int m = paraml.readInt();
      int n = paraml.readInt();
      paraml.eM(4);
      if (n == a.aXk)
      {
        str2 = paraml.eN(m - 12);
      }
      else if (n == a.aXl)
      {
        str1 = paraml.eN(m - 12);
      }
      else
      {
        if (n == a.aXm)
        {
          i = m;
          j = k;
        }
        paraml.eM(m - 12);
      }
    }
    if ((!"com.apple.iTunes".equals(str2)) || (!"iTunSMPB".equals(str1)) || (j == -1))
    {
      AppMethodBeat.o(94994);
      paraml = localObject;
    }
    while (true)
    {
      return paraml;
      paraml.setPosition(j);
      paraml.eM(16);
      paraml = new CommentFrame("und", str1, paraml.eN(i - 16));
      AppMethodBeat.o(94994);
    }
  }

  public static Metadata.Entry o(l paraml)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    AppMethodBeat.i(94990);
    int i = paraml.position;
    i = paraml.readInt() + i;
    int j = paraml.readInt();
    int k = j >> 24 & 0xFF;
    if ((k == 169) || (k == 65533))
      k = 0xFFFFFF & j;
    while (true)
    {
      try
      {
        if (k == aYF)
        {
          k = paraml.readInt();
          if (paraml.readInt() == a.aXm)
          {
            paraml.eM(8);
            localObject2 = paraml.eN(k - 16);
            localObject2 = new CommentFrame("und", (String)localObject2, (String)localObject2);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject2;
            return paraml;
          }
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Failed to parse comment attribute: ");
          ((StringBuilder)localObject2).append(a.dV(j));
          localObject2 = localObject6;
          continue;
        }
      }
      finally
      {
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
      }
      Object localObject4;
      if ((k == aYD) || (k == aYE))
      {
        localObject4 = a(j, "TIT2", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
      }
      else if ((k == aYK) || (k == aYL))
      {
        localObject4 = a(j, "TCOM", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
      }
      else if (k == aYG)
      {
        localObject4 = a(j, "TDRC", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
      }
      else if (k == aYH)
      {
        localObject4 = a(j, "TPE1", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
      }
      else if (k == aYI)
      {
        localObject4 = a(j, "TSSE", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
      }
      else if (k == aYJ)
      {
        localObject4 = a(j, "TALB", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
      }
      else if (k == aYM)
      {
        localObject4 = a(j, "USLT", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
      }
      else if (k == aYN)
      {
        localObject4 = a(j, "TCON", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
      }
      else if (k == aYQ)
      {
        localObject4 = a(j, "TIT1", paraml);
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = (l)localObject4;
        continue;
        if (j == aYP)
        {
          j = p(paraml);
          if ((j > 0) && (j <= aZg.length));
          for (localObject6 = aZg[(j - 1)]; ; localObject6 = null)
          {
            if (localObject6 != null)
              localObject4 = new TextInformationFrame("TCON", null, (String)localObject6);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
            break;
          }
        }
        if (j == aYR)
        {
          localObject4 = b(j, "TPOS", paraml);
          paraml.setPosition(i);
          AppMethodBeat.o(94990);
          paraml = (l)localObject4;
        }
        else if (j == aYS)
        {
          localObject4 = b(j, "TRCK", paraml);
          paraml.setPosition(i);
          AppMethodBeat.o(94990);
          paraml = (l)localObject4;
        }
        else if (j == aYT)
        {
          localObject4 = a(j, "TBPM", paraml, true, false);
          paraml.setPosition(i);
          AppMethodBeat.o(94990);
          paraml = (l)localObject4;
        }
        else if (j == aYU)
        {
          localObject4 = a(j, "TCMP", paraml, true, true);
          paraml.setPosition(i);
          AppMethodBeat.o(94990);
          paraml = (l)localObject4;
        }
        else
        {
          if (j == aYO)
          {
            j = paraml.readInt();
            localObject6 = localObject5;
            if (paraml.readInt() == a.aXm)
            {
              k = a.dU(paraml.readInt());
              if (k != 13)
                break label847;
              localObject4 = "image/jpeg";
            }
            while (true)
            {
              localObject6 = localObject5;
              if (localObject4 != null)
              {
                paraml.eM(4);
                localObject6 = new byte[j - 16];
                paraml.readBytes((byte[])localObject6, 0, localObject6.length);
                localObject6 = new ApicFrame((String)localObject4, null, 3, (byte[])localObject6);
              }
              paraml.setPosition(i);
              AppMethodBeat.o(94990);
              paraml = (l)localObject6;
              break;
              label847: if (k == 14)
                localObject4 = "image/png";
              else
                localObject4 = null;
            }
          }
          if (j == aYV)
          {
            localObject4 = a(j, "TPE2", paraml);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aYW)
          {
            localObject4 = a(j, "TSOT", paraml);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aYX)
          {
            localObject4 = a(j, "TSO2", paraml);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aYY)
          {
            localObject4 = a(j, "TSOA", paraml);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aYZ)
          {
            localObject4 = a(j, "TSOP", paraml);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aZa)
          {
            localObject4 = a(j, "TSOC", paraml);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aZb)
          {
            localObject4 = a(j, "ITUNESADVISORY", paraml, false, false);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aZc)
          {
            localObject4 = a(j, "ITUNESGAPLESS", paraml, false, true);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aZd)
          {
            localObject4 = a(j, "TVSHOWSORT", paraml);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aZe)
          {
            localObject4 = a(j, "TVSHOW", paraml);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
          else if (j == aZf)
          {
            localObject4 = d(paraml, i);
            paraml.setPosition(i);
            AppMethodBeat.o(94990);
            paraml = (l)localObject4;
          }
        }
      }
      else
      {
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("Skipped unknown metadata entry: ");
        ((StringBuilder)localObject4).append(a.dV(j));
        paraml.setPosition(i);
        AppMethodBeat.o(94990);
        paraml = localObject1;
      }
    }
  }

  private static int p(l paraml)
  {
    AppMethodBeat.i(94995);
    paraml.eM(4);
    int i;
    if (paraml.readInt() == a.aXm)
    {
      paraml.eM(8);
      i = paraml.readUnsignedByte();
      AppMethodBeat.o(94995);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(94995);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.f
 * JD-Core Version:    0.6.2
 */