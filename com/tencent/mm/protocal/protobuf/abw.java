package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abw extends com.tencent.mm.bt.a
{
  public String vWF;
  public long wji;
  public long wjj;
  public long wjk;
  public String wjl;
  public long wjm;
  public String wjn;
  public String wjo;
  public String wjp;
  public String wjq;
  public String wjr;
  public String wjs;
  public int wjt;
  public String wju;
  public int wjv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56792);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.wji);
      paramArrayOfObject.ai(2, this.wjj);
      paramArrayOfObject.ai(3, this.wjk);
      if (this.wjl != null)
        paramArrayOfObject.e(4, this.wjl);
      paramArrayOfObject.ai(5, this.wjm);
      if (this.wjn != null)
        paramArrayOfObject.e(6, this.wjn);
      if (this.wjo != null)
        paramArrayOfObject.e(7, this.wjo);
      if (this.wjp != null)
        paramArrayOfObject.e(8, this.wjp);
      if (this.wjq != null)
        paramArrayOfObject.e(9, this.wjq);
      if (this.wjr != null)
        paramArrayOfObject.e(10, this.wjr);
      if (this.wjs != null)
        paramArrayOfObject.e(11, this.wjs);
      paramArrayOfObject.iz(12, this.wjt);
      if (this.wju != null)
        paramArrayOfObject.e(13, this.wju);
      paramArrayOfObject.iz(14, this.wjv);
      if (this.vWF != null)
        paramArrayOfObject.e(15, this.vWF);
      AppMethodBeat.o(56792);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.o(1, this.wji) + 0 + e.a.a.b.b.a.o(2, this.wjj) + e.a.a.b.b.a.o(3, this.wjk);
        paramInt = i;
        if (this.wjl != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wjl);
        i = paramInt + e.a.a.b.b.a.o(5, this.wjm);
        paramInt = i;
        if (this.wjn != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wjn);
        i = paramInt;
        if (this.wjo != null)
          i = paramInt + e.a.a.b.b.a.f(7, this.wjo);
        paramInt = i;
        if (this.wjp != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.wjp);
        i = paramInt;
        if (this.wjq != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.wjq);
        paramInt = i;
        if (this.wjr != null)
          paramInt = i + e.a.a.b.b.a.f(10, this.wjr);
        i = paramInt;
        if (this.wjs != null)
          i = paramInt + e.a.a.b.b.a.f(11, this.wjs);
        i += e.a.a.b.b.a.bs(12, this.wjt);
        paramInt = i;
        if (this.wju != null)
          paramInt = i + e.a.a.b.b.a.f(13, this.wju);
        i = paramInt + e.a.a.b.b.a.bs(14, this.wjv);
        paramInt = i;
        if (this.vWF != null)
          paramInt = i + e.a.a.b.b.a.f(15, this.vWF);
        AppMethodBeat.o(56792);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56792);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abw localabw = (abw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56792);
          break;
        case 1:
          localabw.wji = locala.BTU.ve();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 2:
          localabw.wjj = locala.BTU.ve();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 3:
          localabw.wjk = locala.BTU.ve();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 4:
          localabw.wjl = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 5:
          localabw.wjm = locala.BTU.ve();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 6:
          localabw.wjn = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 7:
          localabw.wjo = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 8:
          localabw.wjp = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 9:
          localabw.wjq = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 10:
          localabw.wjr = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 11:
          localabw.wjs = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 12:
          localabw.wjt = locala.BTU.vd();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 13:
          localabw.wju = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 14:
          localabw.wjv = locala.BTU.vd();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        case 15:
          localabw.vWF = locala.BTU.readString();
          AppMethodBeat.o(56792);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56792);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abw
 * JD-Core Version:    0.6.2
 */