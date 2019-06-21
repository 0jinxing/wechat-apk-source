package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.btd;

public class a$a<T extends btd>
{
  public String aIm;
  public m cwn;
  public int errCode;
  public int errType;
  public T fsy;
  public a fsz;

  public static <T extends btd> a<T> a(int paramInt1, int paramInt2, String paramString, T paramT, m paramm, a parama)
  {
    AppMethodBeat.i(58149);
    a locala = new a();
    locala.errType = paramInt1;
    locala.errCode = paramInt2;
    locala.aIm = paramString;
    locala.fsy = paramT;
    locala.cwn = paramm;
    locala.fsz = parama;
    if (parama != null)
      parama.a(paramInt1, paramInt2, paramString, paramT, paramm);
    AppMethodBeat.o(58149);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.a.a
 * JD-Core Version:    0.6.2
 */