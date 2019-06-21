package com.google.android.exoplayer2.source.b.a;

import com.google.android.exoplayer2.Format;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class a extends c
{
  public final List<Format> bit;
  public final List<a> bjF;
  public final List<a> bjG;
  public final List<a> bjH;
  public final Format bjp;

  public a(String paramString, List<String> paramList, List<a> paramList1, List<a> paramList2, List<a> paramList3, Format paramFormat, List<Format> paramList4)
  {
    super(paramString, paramList);
    AppMethodBeat.i(125962);
    this.bjF = Collections.unmodifiableList(paramList1);
    this.bjG = Collections.unmodifiableList(paramList2);
    this.bjH = Collections.unmodifiableList(paramList3);
    this.bjp = paramFormat;
    if (paramList4 != null);
    for (paramString = Collections.unmodifiableList(paramList4); ; paramString = null)
    {
      this.bit = paramString;
      AppMethodBeat.o(125962);
      return;
    }
  }

  public static final class a
  {
    public final Format aOv;
    public final String url;

    public a(String paramString, Format paramFormat)
    {
      this.url = paramString;
      this.aOv = paramFormat;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.a.a
 * JD-Core Version:    0.6.2
 */