package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bvy extends com.tencent.mm.bt.a
{
  public int wWH;
  public int wWI;
  public int wWJ;
  public int wWK;
  public int wWL;
  public int wWM;
  public int wWN;
  public com.tencent.mm.bt.b wdt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28628);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wdt == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: data");
        AppMethodBeat.o(28628);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wWH);
      paramArrayOfObject.iz(2, this.wWI);
      paramArrayOfObject.iz(3, this.wWJ);
      paramArrayOfObject.iz(4, this.wWK);
      paramArrayOfObject.iz(5, this.wWL);
      paramArrayOfObject.iz(6, this.wWM);
      paramArrayOfObject.iz(7, this.wWN);
      if (this.wdt != null)
        paramArrayOfObject.c(8, this.wdt);
      AppMethodBeat.o(28628);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wWH) + 0 + e.a.a.b.b.a.bs(2, this.wWI) + e.a.a.b.b.a.bs(3, this.wWJ) + e.a.a.b.b.a.bs(4, this.wWK) + e.a.a.b.b.a.bs(5, this.wWL) + e.a.a.b.b.a.bs(6, this.wWM) + e.a.a.b.b.a.bs(7, this.wWN);
        paramInt = i;
        if (this.wdt != null)
          paramInt = i + e.a.a.b.b.a.b(8, this.wdt);
        AppMethodBeat.o(28628);
      }
      else
      {
        Object localObject;
        if (paramInt == 2)
        {
          paramArrayOfObject = (byte[])paramArrayOfObject[0];
          localObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
          for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject))
            if (!super.populateBuilderWithField((e.a.a.a.a)localObject, this, paramInt))
              ((e.a.a.a.a)localObject).ems();
          if (paramArrayOfObject == null)
          {
            paramArrayOfObject = new e.a.a.b("Not all required fields were included: data");
            AppMethodBeat.o(28628);
            throw paramArrayOfObject;
          }
          AppMethodBeat.o(28628);
          paramInt = 0;
        }
        else if (paramInt == 3)
        {
          e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
          localObject = (bvy)paramArrayOfObject[1];
          switch (((Integer)paramArrayOfObject[2]).intValue())
          {
          default:
            paramInt = -1;
            AppMethodBeat.o(28628);
            break;
          case 1:
            ((bvy)localObject).wWH = locala.BTU.vd();
            AppMethodBeat.o(28628);
            paramInt = 0;
            break;
          case 2:
            ((bvy)localObject).wWI = locala.BTU.vd();
            AppMethodBeat.o(28628);
            paramInt = 0;
            break;
          case 3:
            ((bvy)localObject).wWJ = locala.BTU.vd();
            AppMethodBeat.o(28628);
            paramInt = 0;
            break;
          case 4:
            ((bvy)localObject).wWK = locala.BTU.vd();
            AppMethodBeat.o(28628);
            paramInt = 0;
            break;
          case 5:
            ((bvy)localObject).wWL = locala.BTU.vd();
            AppMethodBeat.o(28628);
            paramInt = 0;
            break;
          case 6:
            ((bvy)localObject).wWM = locala.BTU.vd();
            AppMethodBeat.o(28628);
            paramInt = 0;
            break;
          case 7:
            ((bvy)localObject).wWN = locala.BTU.vd();
            AppMethodBeat.o(28628);
            paramInt = 0;
            break;
          case 8:
            ((bvy)localObject).wdt = locala.BTU.emu();
            AppMethodBeat.o(28628);
            paramInt = 0;
            break;
          }
        }
        else
        {
          paramInt = -1;
          AppMethodBeat.o(28628);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvy
 * JD-Core Version:    0.6.2
 */