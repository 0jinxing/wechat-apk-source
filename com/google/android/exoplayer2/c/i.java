package com.google.android.exoplayer2.c;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class i
{
  public static final a.a aSR;
  private static final Pattern aSS;
  public int aOp = -1;
  public int aOq = -1;

  static
  {
    AppMethodBeat.i(94883);
    aSR = new i.1();
    aSS = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    AppMethodBeat.o(94883);
  }

  private boolean l(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(94882);
    if (!"iTunSMPB".equals(paramString1))
      AppMethodBeat.o(94882);
    while (true)
    {
      return bool;
      paramString1 = aSS.matcher(paramString2);
      if (paramString1.find())
        try
        {
          int i = Integer.parseInt(paramString1.group(1), 16);
          int j = Integer.parseInt(paramString1.group(2), 16);
          if ((i > 0) || (j > 0))
          {
            this.aOp = i;
            this.aOq = j;
            AppMethodBeat.o(94882);
            bool = true;
          }
        }
        catch (NumberFormatException paramString1)
        {
        }
      else
        AppMethodBeat.o(94882);
    }
  }

  public final boolean c(Metadata paramMetadata)
  {
    boolean bool = false;
    AppMethodBeat.i(94881);
    int i = 0;
    if (i < paramMetadata.beW.length)
    {
      Object localObject = paramMetadata.beW[i];
      if ((localObject instanceof CommentFrame))
      {
        localObject = (CommentFrame)localObject;
        if (l(((CommentFrame)localObject).description, ((CommentFrame)localObject).text))
        {
          bool = true;
          AppMethodBeat.o(94881);
        }
      }
    }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(94881);
    }
  }

  public final boolean rc()
  {
    if ((this.aOp != -1) && (this.aOq != -1));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.i
 * JD-Core Version:    0.6.2
 */