package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bbc extends com.tencent.mm.bt.a
{
  public String cEh;
  public int type;
  public String url;
  public String wFS;
  public String wFT;
  public String wFU;
  public int wFV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56853);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cEh == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: wording");
        AppMethodBeat.o(56853);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.type);
      if (this.cEh != null)
        paramArrayOfObject.e(2, this.cEh);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      if (this.wFS != null)
        paramArrayOfObject.e(4, this.wFS);
      if (this.wFT != null)
        paramArrayOfObject.e(5, this.wFT);
      if (this.wFU != null)
        paramArrayOfObject.e(6, this.wFU);
      paramArrayOfObject.iz(7, this.wFV);
      AppMethodBeat.o(56853);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.cEh != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.cEh);
        i = paramInt;
        if (this.url != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.url);
        paramInt = i;
        if (this.wFS != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wFS);
        i = paramInt;
        if (this.wFT != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.wFT);
        paramInt = i;
        if (this.wFU != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.wFU);
        paramInt += e.a.a.b.b.a.bs(7, this.wFV);
        AppMethodBeat.o(56853);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.cEh == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: wording");
          AppMethodBeat.o(56853);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56853);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbc localbbc = (bbc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56853);
          break;
        case 1:
          localbbc.type = locala.BTU.vd();
          AppMethodBeat.o(56853);
          paramInt = 0;
          break;
        case 2:
          localbbc.cEh = locala.BTU.readString();
          AppMethodBeat.o(56853);
          paramInt = 0;
          break;
        case 3:
          localbbc.url = locala.BTU.readString();
          AppMethodBeat.o(56853);
          paramInt = 0;
          break;
        case 4:
          localbbc.wFS = locala.BTU.readString();
          AppMethodBeat.o(56853);
          paramInt = 0;
          break;
        case 5:
          localbbc.wFT = locala.BTU.readString();
          AppMethodBeat.o(56853);
          paramInt = 0;
          break;
        case 6:
          localbbc.wFU = locala.BTU.readString();
          AppMethodBeat.o(56853);
          paramInt = 0;
          break;
        case 7:
          localbbc.wFV = locala.BTU.vd();
          AppMethodBeat.o(56853);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56853);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbc
 * JD-Core Version:    0.6.2
 */