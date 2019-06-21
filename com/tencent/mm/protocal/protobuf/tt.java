package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class tt extends com.tencent.mm.bt.a
{
  public String app_id;
  public String waU;
  public String waV;
  public String waW;
  public int waX;
  public int waY;
  public int waZ;
  public int wba;
  public int wbb;
  public int wbc;
  public String wbd;
  public String wbe;
  public String wbf;
  public b wbg;
  public String wbh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135599);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.app_id != null)
        paramArrayOfObject.e(1, this.app_id);
      if (this.waU != null)
        paramArrayOfObject.e(2, this.waU);
      if (this.waV != null)
        paramArrayOfObject.e(3, this.waV);
      if (this.waW != null)
        paramArrayOfObject.e(4, this.waW);
      paramArrayOfObject.iz(5, this.waX);
      paramArrayOfObject.iz(6, this.waY);
      paramArrayOfObject.iz(7, this.waZ);
      paramArrayOfObject.iz(10, this.wba);
      paramArrayOfObject.iz(11, this.wbb);
      paramArrayOfObject.iz(12, this.wbc);
      if (this.wbd != null)
        paramArrayOfObject.e(15, this.wbd);
      if (this.wbe != null)
        paramArrayOfObject.e(16, this.wbe);
      if (this.wbf != null)
        paramArrayOfObject.e(17, this.wbf);
      if (this.wbg != null)
        paramArrayOfObject.c(18, this.wbg);
      if (this.wbh != null)
        paramArrayOfObject.e(19, this.wbh);
      AppMethodBeat.o(135599);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.app_id == null)
        break label1041;
    label1041: for (i = e.a.a.b.b.a.f(1, this.app_id) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.waU != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.waU);
      i = paramInt;
      if (this.waV != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.waV);
      paramInt = i;
      if (this.waW != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.waW);
      i = paramInt + e.a.a.b.b.a.bs(5, this.waX) + e.a.a.b.b.a.bs(6, this.waY) + e.a.a.b.b.a.bs(7, this.waZ) + e.a.a.b.b.a.bs(10, this.wba) + e.a.a.b.b.a.bs(11, this.wbb) + e.a.a.b.b.a.bs(12, this.wbc);
      paramInt = i;
      if (this.wbd != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wbd);
      i = paramInt;
      if (this.wbe != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.wbe);
      paramInt = i;
      if (this.wbf != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.wbf);
      i = paramInt;
      if (this.wbg != null)
        i = paramInt + e.a.a.b.b.a.b(18, this.wbg);
      paramInt = i;
      if (this.wbh != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.wbh);
      AppMethodBeat.o(135599);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(135599);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        tt localtt = (tt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 8:
        case 9:
        case 13:
        case 14:
        default:
          paramInt = -1;
          AppMethodBeat.o(135599);
          break;
        case 1:
          localtt.app_id = locala.BTU.readString();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 2:
          localtt.waU = locala.BTU.readString();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 3:
          localtt.waV = locala.BTU.readString();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 4:
          localtt.waW = locala.BTU.readString();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 5:
          localtt.waX = locala.BTU.vd();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 6:
          localtt.waY = locala.BTU.vd();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 7:
          localtt.waZ = locala.BTU.vd();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 10:
          localtt.wba = locala.BTU.vd();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 11:
          localtt.wbb = locala.BTU.vd();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 12:
          localtt.wbc = locala.BTU.vd();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 15:
          localtt.wbd = locala.BTU.readString();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 16:
          localtt.wbe = locala.BTU.readString();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 17:
          localtt.wbf = locala.BTU.readString();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 18:
          localtt.wbg = locala.BTU.emu();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        case 19:
          localtt.wbh = locala.BTU.readString();
          AppMethodBeat.o(135599);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135599);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.tt
 * JD-Core Version:    0.6.2
 */