package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bwr extends com.tencent.mm.bt.a
{
  public String cvZ;
  public String eyr;
  public int fVJ;
  public int fXd;
  public int fgI;
  public int fgJ;
  public String qQm;
  public String url;
  public LinkedList<chk> wXc;
  public int wXd;

  public bwr()
  {
    AppMethodBeat.i(51002);
    this.wXc = new LinkedList();
    AppMethodBeat.o(51002);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(51003);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.qQm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: clientID");
        AppMethodBeat.o(51003);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.e(1, 8, this.wXc);
      if (this.qQm != null)
        paramArrayOfObject.e(2, this.qQm);
      if (this.cvZ != null)
        paramArrayOfObject.e(3, this.cvZ);
      if (this.eyr != null)
        paramArrayOfObject.e(4, this.eyr);
      if (this.url != null)
        paramArrayOfObject.e(5, this.url);
      paramArrayOfObject.iz(6, this.fXd);
      paramArrayOfObject.iz(7, this.fVJ);
      paramArrayOfObject.iz(8, this.wXd);
      paramArrayOfObject.iz(9, this.fgI);
      paramArrayOfObject.iz(10, this.fgJ);
      AppMethodBeat.o(51003);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.wXc) + 0;
        paramInt = i;
        if (this.qQm != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.qQm);
        i = paramInt;
        if (this.cvZ != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.cvZ);
        paramInt = i;
        if (this.eyr != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.eyr);
        i = paramInt;
        if (this.url != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.url);
        paramInt = i + e.a.a.b.b.a.bs(6, this.fXd) + e.a.a.b.b.a.bs(7, this.fVJ) + e.a.a.b.b.a.bs(8, this.wXd) + e.a.a.b.b.a.bs(9, this.fgI) + e.a.a.b.b.a.bs(10, this.fgJ);
        AppMethodBeat.o(51003);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wXc.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.qQm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: clientID");
          AppMethodBeat.o(51003);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51003);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bwr localbwr = (bwr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51003);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((chk)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbwr.wXc.add(localObject1);
          }
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 2:
          localbwr.qQm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 3:
          localbwr.cvZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 4:
          localbwr.eyr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 5:
          localbwr.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 6:
          localbwr.fXd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 7:
          localbwr.fVJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 8:
          localbwr.wXd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 9:
          localbwr.fgI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        case 10:
          localbwr.fgJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51003);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(51003);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwr
 * JD-Core Version:    0.6.2
 */