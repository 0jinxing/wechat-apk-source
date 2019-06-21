package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aos extends bsr
{
  public int mZF;
  public LinkedList<bts> nbX;
  public String nbs;
  public int ncn;
  public int nco;
  public int wsQ;

  public aos()
  {
    AppMethodBeat.i(80097);
    this.nbX = new LinkedList();
    AppMethodBeat.o(80097);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80098);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.mZF);
      paramArrayOfObject.iz(3, this.ncn);
      paramArrayOfObject.iz(4, this.nco);
      if (this.nbs != null)
        paramArrayOfObject.e(5, this.nbs);
      paramArrayOfObject.iz(6, this.wsQ);
      paramArrayOfObject.e(7, 8, this.nbX);
      AppMethodBeat.o(80098);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label719;
    label719: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.mZF) + e.a.a.b.b.a.bs(3, this.ncn) + e.a.a.b.b.a.bs(4, this.nco);
      paramInt = i;
      if (this.nbs != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.nbs);
      paramInt = paramInt + e.a.a.b.b.a.bs(6, this.wsQ) + e.a.a.a.c(7, 8, this.nbX);
      AppMethodBeat.o(80098);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nbX.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80098);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aos localaos = (aos)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80098);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaos.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(80098);
          paramInt = i;
          break;
        case 2:
          localaos.mZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80098);
          paramInt = i;
          break;
        case 3:
          localaos.ncn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80098);
          paramInt = i;
          break;
        case 4:
          localaos.nco = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80098);
          paramInt = i;
          break;
        case 5:
          localaos.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80098);
          paramInt = i;
          break;
        case 6:
          localaos.wsQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80098);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaos.nbX.add(localObject1);
          }
          AppMethodBeat.o(80098);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80098);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aos
 * JD-Core Version:    0.6.2
 */