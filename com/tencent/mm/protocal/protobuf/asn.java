package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class asn extends com.tencent.mm.bt.a
{
  public com.tencent.mm.bt.b wvY;
  public int wvZ;
  public LinkedList<asp> wwa;
  public LinkedList<Integer> wwb;

  public asn()
  {
    AppMethodBeat.i(5214);
    this.wwa = new LinkedList();
    this.wwb = new LinkedList();
    AppMethodBeat.o(5214);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5215);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wvY == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: RawBuf");
        AppMethodBeat.o(5215);
        throw paramArrayOfObject;
      }
      if (this.wvY != null)
        paramArrayOfObject.c(1, this.wvY);
      paramArrayOfObject.iz(2, this.wvZ);
      paramArrayOfObject.e(3, 8, this.wwa);
      paramArrayOfObject.e(4, 2, this.wwb);
      AppMethodBeat.o(5215);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wvY == null)
        break label541;
    label541: for (paramInt = e.a.a.b.b.a.b(1, this.wvY) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wvZ) + e.a.a.a.c(3, 8, this.wwa) + e.a.a.a.c(4, 2, this.wwb);
      AppMethodBeat.o(5215);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wwa.clear();
        this.wwb.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wvY == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: RawBuf");
          AppMethodBeat.o(5215);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5215);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        asn localasn = (asn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5215);
          break;
        case 1:
          localasn.wvY = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(5215);
          paramInt = i;
          break;
        case 2:
          localasn.wvZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5215);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new asp();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasn.wwa.add(paramArrayOfObject);
          }
          AppMethodBeat.o(5215);
          paramInt = i;
          break;
        case 4:
          localasn.wwb.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(5215);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5215);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asn
 * JD-Core Version:    0.6.2
 */