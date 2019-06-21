package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cho extends com.tencent.mm.bt.a
{
  public int Category;
  public String ncM;
  public int wSb;
  public LinkedList<String> wSd;
  public long xgq;
  public int xgr;

  public cho()
  {
    AppMethodBeat.i(55704);
    this.wSd = new LinkedList();
    AppMethodBeat.o(55704);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55705);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ncM != null)
        paramArrayOfObject.e(1, this.ncM);
      paramArrayOfObject.ai(2, this.xgq);
      paramArrayOfObject.iz(3, this.wSb);
      paramArrayOfObject.iz(4, this.xgr);
      paramArrayOfObject.iz(5, this.Category);
      paramArrayOfObject.e(6, 1, this.wSd);
      AppMethodBeat.o(55705);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ncM == null)
        break label474;
    label474: for (paramInt = e.a.a.b.b.a.f(1, this.ncM) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.xgq) + e.a.a.b.b.a.bs(3, this.wSb) + e.a.a.b.b.a.bs(4, this.xgr) + e.a.a.b.b.a.bs(5, this.Category) + e.a.a.a.c(6, 1, this.wSd);
      AppMethodBeat.o(55705);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wSd.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(55705);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cho localcho = (cho)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55705);
          break;
        case 1:
          localcho.ncM = locala.BTU.readString();
          AppMethodBeat.o(55705);
          paramInt = i;
          break;
        case 2:
          localcho.xgq = locala.BTU.ve();
          AppMethodBeat.o(55705);
          paramInt = i;
          break;
        case 3:
          localcho.wSb = locala.BTU.vd();
          AppMethodBeat.o(55705);
          paramInt = i;
          break;
        case 4:
          localcho.xgr = locala.BTU.vd();
          AppMethodBeat.o(55705);
          paramInt = i;
          break;
        case 5:
          localcho.Category = locala.BTU.vd();
          AppMethodBeat.o(55705);
          paramInt = i;
          break;
        case 6:
          localcho.wSd.add(locala.BTU.readString());
          AppMethodBeat.o(55705);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55705);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cho
 * JD-Core Version:    0.6.2
 */