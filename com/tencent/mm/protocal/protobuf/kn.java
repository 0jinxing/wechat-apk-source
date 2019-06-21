package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class kn extends bsr
{
  public String ProductID;
  public int Scene;
  public LinkedList<String> vNF;
  public String vNG;
  public double vNH;
  public double vNI;

  public kn()
  {
    AppMethodBeat.i(11711);
    this.vNF = new LinkedList();
    AppMethodBeat.o(11711);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11712);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ProductID != null)
        paramArrayOfObject.e(2, this.ProductID);
      paramArrayOfObject.e(3, 1, this.vNF);
      paramArrayOfObject.iz(4, this.Scene);
      if (this.vNG != null)
        paramArrayOfObject.e(5, this.vNG);
      paramArrayOfObject.f(6, this.vNH);
      paramArrayOfObject.f(7, this.vNI);
      AppMethodBeat.o(11712);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label672;
    label672: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ProductID != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ProductID);
      i = i + e.a.a.a.c(3, 1, this.vNF) + e.a.a.b.b.a.bs(4, this.Scene);
      paramInt = i;
      if (this.vNG != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vNG);
      paramInt = paramInt + (e.a.a.b.b.a.fv(6) + 8) + (e.a.a.b.b.a.fv(7) + 8);
      AppMethodBeat.o(11712);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vNF.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11712);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        kn localkn = (kn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11712);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localkn.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11712);
          paramInt = i;
          break;
        case 2:
          localkn.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11712);
          paramInt = i;
          break;
        case 3:
          localkn.vNF.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(11712);
          paramInt = i;
          break;
        case 4:
          localkn.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11712);
          paramInt = i;
          break;
        case 5:
          localkn.vNG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11712);
          paramInt = i;
          break;
        case 6:
          localkn.vNH = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(11712);
          paramInt = i;
          break;
        case 7:
          localkn.vNI = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(11712);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11712);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kn
 * JD-Core Version:    0.6.2
 */