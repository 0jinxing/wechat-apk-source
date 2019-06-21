package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class CharsetMatch
  implements Comparable<CharsetMatch>
{
  private String fCharsetName;
  private int fConfidence;
  private InputStream fInputStream;
  private String fLang;
  private byte[] fRawInput;
  private int fRawLength;

  CharsetMatch(CharsetDetector paramCharsetDetector, CharsetRecognizer paramCharsetRecognizer, int paramInt)
  {
    AppMethodBeat.i(104730);
    this.fRawInput = null;
    this.fInputStream = null;
    this.fConfidence = paramInt;
    if (paramCharsetDetector.fInputStream == null)
    {
      this.fRawInput = paramCharsetDetector.fRawInput;
      this.fRawLength = paramCharsetDetector.fRawLength;
    }
    this.fInputStream = paramCharsetDetector.fInputStream;
    this.fCharsetName = paramCharsetRecognizer.getName();
    this.fLang = paramCharsetRecognizer.getLanguage();
    AppMethodBeat.o(104730);
  }

  CharsetMatch(CharsetDetector paramCharsetDetector, CharsetRecognizer paramCharsetRecognizer, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(104731);
    this.fRawInput = null;
    this.fInputStream = null;
    this.fConfidence = paramInt;
    if (paramCharsetDetector.fInputStream == null)
    {
      this.fRawInput = paramCharsetDetector.fRawInput;
      this.fRawLength = paramCharsetDetector.fRawLength;
    }
    this.fInputStream = paramCharsetDetector.fInputStream;
    this.fCharsetName = paramString1;
    this.fLang = paramString2;
    AppMethodBeat.o(104731);
  }

  public int compareTo(CharsetMatch paramCharsetMatch)
  {
    int i = 0;
    if (this.fConfidence > paramCharsetMatch.fConfidence)
      i = 1;
    while (true)
    {
      return i;
      if (this.fConfidence < paramCharsetMatch.fConfidence)
        i = -1;
    }
  }

  public int getConfidence()
  {
    return this.fConfidence;
  }

  public String getLanguage()
  {
    return this.fLang;
  }

  public String getName()
  {
    return this.fCharsetName;
  }

  public Reader getReader()
  {
    AppMethodBeat.i(104727);
    Object localObject1 = this.fInputStream;
    if (localObject1 == null)
      localObject1 = new ByteArrayInputStream(this.fRawInput, 0, this.fRawLength);
    while (true)
      try
      {
        ((InputStream)localObject1).reset();
        InputStreamReader localInputStreamReader = new java/io/InputStreamReader;
        localInputStreamReader.<init>((InputStream)localObject1, getName());
        AppMethodBeat.o(104727);
        localObject1 = localInputStreamReader;
        return localObject1;
      }
      catch (IOException localIOException)
      {
        Object localObject2 = null;
        AppMethodBeat.o(104727);
      }
  }

  public String getString()
  {
    AppMethodBeat.i(104728);
    String str = getString(-1);
    AppMethodBeat.o(104728);
    return str;
  }

  public String getString(int paramInt)
  {
    AppMethodBeat.i(104729);
    Object localObject2;
    if (this.fInputStream != null)
    {
      localObject1 = new StringBuilder();
      char[] arrayOfChar = new char[1024];
      localObject2 = getReader();
      int i = paramInt;
      if (paramInt < 0)
        i = 2147483647;
      while (true)
      {
        paramInt = ((Reader)localObject2).read(arrayOfChar, 0, Math.min(i, 1024));
        if (paramInt < 0)
          break;
        ((StringBuilder)localObject1).append(arrayOfChar, 0, paramInt);
        i -= paramInt;
      }
      ((Reader)localObject2).close();
      localObject2 = ((StringBuilder)localObject1).toString();
      AppMethodBeat.o(104729);
      return localObject2;
    }
    Object localObject1 = getName();
    if (((String)localObject1).indexOf("_rtl") < 0);
    for (paramInt = ((String)localObject1).indexOf("_ltr"); ; paramInt = ((String)localObject1).indexOf("_rtl"))
    {
      localObject2 = localObject1;
      if (paramInt > 0)
        localObject2 = ((String)localObject1).substring(0, paramInt);
      localObject2 = new String(this.fRawInput, (String)localObject2);
      AppMethodBeat.o(104729);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetMatch
 * JD-Core Version:    0.6.2
 */