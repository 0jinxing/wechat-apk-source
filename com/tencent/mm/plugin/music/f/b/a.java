package com.tencent.mm.plugin.music.f.b;

import com.google.android.exoplayer2.d.b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.text.NumberFormat;
import java.util.Locale;

public final class a
{
  private static final NumberFormat oNW;

  static
  {
    AppMethodBeat.i(137661);
    NumberFormat localNumberFormat = NumberFormat.getInstance(Locale.US);
    oNW = localNumberFormat;
    localNumberFormat.setMinimumFractionDigits(2);
    oNW.setMaximumFractionDigits(2);
    oNW.setGroupingUsed(false);
    AppMethodBeat.o(137661);
  }

  public static void a(Metadata paramMetadata, String paramString)
  {
    AppMethodBeat.i(137660);
    int i = 0;
    if (i < paramMetadata.beW.length)
    {
      Object localObject = paramMetadata.beW[i];
      if ((localObject instanceof TextInformationFrame))
      {
        localObject = (TextInformationFrame)localObject;
        ab.d("MicroMsg.ExoPlayer", paramString + String.format("%s: value=%s", new Object[] { ((TextInformationFrame)localObject).id, ((TextInformationFrame)localObject).value }));
      }
      while (true)
      {
        i++;
        break;
        if ((localObject instanceof UrlLinkFrame))
        {
          localObject = (UrlLinkFrame)localObject;
          ab.d("MicroMsg.ExoPlayer", paramString + String.format("%s: url=%s", new Object[] { ((UrlLinkFrame)localObject).id, ((UrlLinkFrame)localObject).url }));
        }
        else if ((localObject instanceof PrivFrame))
        {
          localObject = (PrivFrame)localObject;
          ab.d("MicroMsg.ExoPlayer", paramString + String.format("%s: owner=%s", new Object[] { ((PrivFrame)localObject).id, ((PrivFrame)localObject).bfz }));
        }
        else if ((localObject instanceof GeobFrame))
        {
          localObject = (GeobFrame)localObject;
          ab.d("MicroMsg.ExoPlayer", paramString + String.format("%s: mimeType=%s, filename=%s, description=%s", new Object[] { ((GeobFrame)localObject).id, ((GeobFrame)localObject).mimeType, ((GeobFrame)localObject).filename, ((GeobFrame)localObject).description }));
        }
        else if ((localObject instanceof ApicFrame))
        {
          localObject = (ApicFrame)localObject;
          ab.d("MicroMsg.ExoPlayer", paramString + String.format("%s: mimeType=%s, description=%s", new Object[] { ((ApicFrame)localObject).id, ((ApicFrame)localObject).mimeType, ((ApicFrame)localObject).description }));
        }
        else if ((localObject instanceof CommentFrame))
        {
          localObject = (CommentFrame)localObject;
          ab.d("MicroMsg.ExoPlayer", paramString + String.format("%s: language=%s, description=%s", new Object[] { ((CommentFrame)localObject).id, ((CommentFrame)localObject).aOt, ((CommentFrame)localObject).description }));
        }
        else if ((localObject instanceof Id3Frame))
        {
          localObject = (Id3Frame)localObject;
          ab.d("MicroMsg.ExoPlayer", paramString + String.format("%s", new Object[] { ((Id3Frame)localObject).id }));
        }
        else if ((localObject instanceof EventMessage))
        {
          localObject = (EventMessage)localObject;
          ab.d("MicroMsg.ExoPlayer", paramString + String.format("EMSG: scheme=%s, id=%d, value=%s", new Object[] { ((EventMessage)localObject).bfh, Long.valueOf(((EventMessage)localObject).id), ((EventMessage)localObject).value }));
        }
      }
    }
    AppMethodBeat.o(137660);
  }

  public static void bUI()
  {
    AppMethodBeat.i(137658);
    b.DEBUG = false;
    b.a(new a.1());
    AppMethodBeat.o(137658);
  }

  public static String jo(long paramLong)
  {
    AppMethodBeat.i(137659);
    String str;
    if (paramLong == -9223372036854775807L)
    {
      str = "?";
      AppMethodBeat.o(137659);
    }
    while (true)
    {
      return str;
      str = oNW.format((float)paramLong / 1000.0F);
      AppMethodBeat.o(137659);
    }
  }

  public static String zT(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "?";
    case 2:
    case 4:
    case 1:
    case 3:
    }
    while (true)
    {
      return str;
      str = "B";
      continue;
      str = "E";
      continue;
      str = "I";
      continue;
      str = "R";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.b.a
 * JD-Core Version:    0.6.2
 */