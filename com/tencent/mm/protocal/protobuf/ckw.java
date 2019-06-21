package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ckw extends com.tencent.mm.bt.a
{
  public int ptw;
  public int ptx;
  public String wdD;
  public String wdE;
  public String wdF;
  public String wdO;
  public com.tencent.mm.bt.b xiD;
  public boolean xiE;
  public LinkedList<String> xiF;
  public String xiG;

  public ckw()
  {
    AppMethodBeat.i(62584);
    this.xiF = new LinkedList();
    AppMethodBeat.o(62584);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62585);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xiD == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: EmojiBuffer");
        AppMethodBeat.o(62585);
        throw paramArrayOfObject;
      }
      if (this.wdO != null)
        paramArrayOfObject.e(1, this.wdO);
      paramArrayOfObject.iz(2, this.ptx);
      paramArrayOfObject.iz(3, this.ptw);
      if (this.xiD != null)
        paramArrayOfObject.c(4, this.xiD);
      paramArrayOfObject.aO(5, this.xiE);
      paramArrayOfObject.e(6, 1, this.xiF);
      if (this.wdD != null)
        paramArrayOfObject.e(7, this.wdD);
      if (this.xiG != null)
        paramArrayOfObject.e(8, this.xiG);
      if (this.wdF != null)
        paramArrayOfObject.e(9, this.wdF);
      if (this.wdE != null)
        paramArrayOfObject.e(10, this.wdE);
      AppMethodBeat.o(62585);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wdO == null)
        break label802;
    label802: for (paramInt = e.a.a.b.b.a.f(1, this.wdO) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptx) + e.a.a.b.b.a.bs(3, this.ptw);
      paramInt = i;
      if (this.xiD != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.xiD);
      i = paramInt + (e.a.a.b.b.a.fv(5) + 1) + e.a.a.a.c(6, 1, this.xiF);
      paramInt = i;
      if (this.wdD != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wdD);
      i = paramInt;
      if (this.xiG != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.xiG);
      paramInt = i;
      if (this.wdF != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wdF);
      i = paramInt;
      if (this.wdE != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wdE);
      AppMethodBeat.o(62585);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xiF.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xiD == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: EmojiBuffer");
          AppMethodBeat.o(62585);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62585);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ckw localckw = (ckw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62585);
          break;
        case 1:
          localckw.wdO = locala.BTU.readString();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 2:
          localckw.ptx = locala.BTU.vd();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 3:
          localckw.ptw = locala.BTU.vd();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 4:
          localckw.xiD = locala.BTU.emu();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 5:
          localckw.xiE = locala.BTU.ehX();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 6:
          localckw.xiF.add(locala.BTU.readString());
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 7:
          localckw.wdD = locala.BTU.readString();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 8:
          localckw.xiG = locala.BTU.readString();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 9:
          localckw.wdF = locala.BTU.readString();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        case 10:
          localckw.wdE = locala.BTU.readString();
          AppMethodBeat.o(62585);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62585);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ckw
 * JD-Core Version:    0.6.2
 */