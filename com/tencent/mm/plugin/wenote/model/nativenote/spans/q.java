package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.ParagraphStyle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum q
{
  public String uSn;
  public String uSo;
  public boolean uSp;
  public String uSq;
  public String uSr;
  public boolean uSs;
  public boolean uSt = false;

  static
  {
    AppMethodBeat.i(26968);
    uSj = new q("NONE", 0, "", "", "", "", false);
    uSk = new q("NOTEUL", 1, "<wx-ul>", "</wx-ul>", "<wx-li>", "</wx-li>", true);
    uSl = new q("NOTEOL", 2, "<wx-ol>", "</wx-ol>", "<wx-li>", "</wx-li>", true);
    uSm = new q("NOTETODO", 3, "", "", "<wn-todo checked=\"1\" >", "</wn-todo>", true);
    uSu = new q[] { uSj, uSk, uSl, uSm };
    AppMethodBeat.o(26968);
  }

  private q(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.uSn = paramString1;
    this.uSo = paramString2;
    this.uSq = paramString3;
    this.uSr = paramString4;
    this.uSp = false;
    this.uSs = paramBoolean1;
  }

  public static q a(ParagraphStyle paramParagraphStyle)
  {
    if ((paramParagraphStyle instanceof d))
      paramParagraphStyle = uSk;
    while (true)
    {
      return paramParagraphStyle;
      if ((paramParagraphStyle instanceof m))
        paramParagraphStyle = uSl;
      else if ((paramParagraphStyle instanceof k))
        paramParagraphStyle = uSm;
      else
        paramParagraphStyle = null;
    }
  }

  public final boolean dfG()
  {
    if (this == uSk);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean dfH()
  {
    if (this == uSl);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean dfI()
  {
    if (this == uSm);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.q
 * JD-Core Version:    0.6.2
 */