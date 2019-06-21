package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class qt extends bsr
{
  public int Scene;
  public String mZr;
  public String ndF;
  public String ndT;
  public int vFH;
  public int vXK;
  public LinkedList<bts> vXL;
  public String vXM;
  public String vXN;

  public qt()
  {
    AppMethodBeat.i(11731);
    this.vXL = new LinkedList();
    AppMethodBeat.o(11731);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11732);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vFH);
      if (this.ndF != null)
        paramArrayOfObject.e(3, this.ndF);
      if (this.ndT != null)
        paramArrayOfObject.e(4, this.ndT);
      if (this.mZr != null)
        paramArrayOfObject.e(5, this.mZr);
      paramArrayOfObject.iz(6, this.vXK);
      paramArrayOfObject.e(7, 8, this.vXL);
      if (this.vXM != null)
        paramArrayOfObject.e(8, this.vXM);
      if (this.vXN != null)
        paramArrayOfObject.e(9, this.vXN);
      paramArrayOfObject.iz(10, this.Scene);
      AppMethodBeat.o(11732);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label950;
    label950: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vFH);
      paramInt = i;
      if (this.ndF != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ndF);
      i = paramInt;
      if (this.ndT != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ndT);
      paramInt = i;
      if (this.mZr != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.mZr);
      i = paramInt + e.a.a.b.b.a.bs(6, this.vXK) + e.a.a.a.c(7, 8, this.vXL);
      paramInt = i;
      if (this.vXM != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vXM);
      i = paramInt;
      if (this.vXN != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vXN);
      paramInt = i + e.a.a.b.b.a.bs(10, this.Scene);
      AppMethodBeat.o(11732);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vXL.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11732);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qt localqt = (qt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11732);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localqt.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 2:
          localqt.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 3:
          localqt.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 4:
          localqt.ndT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 5:
          localqt.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 6:
          localqt.vXK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localqt.vXL.add(paramArrayOfObject);
          }
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 8:
          localqt.vXM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 9:
          localqt.vXN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        case 10:
          localqt.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11732);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11732);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qt
 * JD-Core Version:    0.6.2
 */