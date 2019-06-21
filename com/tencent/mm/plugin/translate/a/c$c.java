package com.tencent.mm.plugin.translate.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf;

public final class c$c
{
  private static int sKD = 0;
  public String cNS;
  public String cPG;
  public String cPz;
  public byte[] dJG;
  public String id;
  public int ret;
  public int sKA;
  public int sKB;
  public String sKC;
  public String source;
  public int type;

  public c$c(String paramString1, String paramString2, int paramInt, String paramString3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26062);
    this.cPz = paramString1;
    this.id = paramString2;
    this.type = paramInt;
    this.source = paramString3;
    this.dJG = paramArrayOfByte;
    if (sKD == 2147483647)
      sKD = 0;
    int i = sKD + 1;
    sKD = i;
    this.sKB = i;
    if (paramInt == 1)
    {
      paramInt = bf.ox(paramString1);
      if (paramInt != -1)
      {
        paramString2 = paramString1.substring(0, paramInt).trim();
        if ((paramString2 != null) && (paramString2.length() > 0))
        {
          this.sKC = paramString2;
          this.cPz = paramString1.substring(paramInt + 1).trim();
        }
      }
    }
    AppMethodBeat.o(26062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a.c.c
 * JD-Core Version:    0.6.2
 */