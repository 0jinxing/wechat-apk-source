package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cnb extends bsr
{
  public String ProductID;
  public int pdc;
  public String wOs;
  public String wOt;
  public int wOu;
  public String wOv;
  public int xkA;
  public String xkB;
  public SKBuiltinBuffer_t xky;
  public int xkz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56992);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xky == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Receipt");
        AppMethodBeat.o(56992);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xky != null)
      {
        paramArrayOfObject.iy(2, this.xky.computeSize());
        this.xky.writeFields(paramArrayOfObject);
      }
      if (this.ProductID != null)
        paramArrayOfObject.e(3, this.ProductID);
      paramArrayOfObject.iz(4, this.xkz);
      paramArrayOfObject.iz(5, this.pdc);
      if (this.wOs != null)
        paramArrayOfObject.e(6, this.wOs);
      if (this.wOt != null)
        paramArrayOfObject.e(7, this.wOt);
      if (this.wOv != null)
        paramArrayOfObject.e(8, this.wOv);
      paramArrayOfObject.iz(9, this.xkA);
      if (this.xkB != null)
        paramArrayOfObject.e(10, this.xkB);
      paramArrayOfObject.iz(11, this.wOu);
      AppMethodBeat.o(56992);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1041;
    label1041: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xky != null)
        paramInt = i + e.a.a.a.ix(2, this.xky.computeSize());
      i = paramInt;
      if (this.ProductID != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ProductID);
      paramInt = i + e.a.a.b.b.a.bs(4, this.xkz) + e.a.a.b.b.a.bs(5, this.pdc);
      i = paramInt;
      if (this.wOs != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wOs);
      paramInt = i;
      if (this.wOt != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wOt);
      i = paramInt;
      if (this.wOv != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wOv);
      i += e.a.a.b.b.a.bs(9, this.xkA);
      paramInt = i;
      if (this.xkB != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.xkB);
      paramInt += e.a.a.b.b.a.bs(11, this.wOu);
      AppMethodBeat.o(56992);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xky == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Receipt");
          AppMethodBeat.o(56992);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56992);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnb localcnb = (cnb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56992);
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
            localcnb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnb.xky = paramArrayOfObject;
          }
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 3:
          localcnb.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 4:
          localcnb.xkz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 5:
          localcnb.pdc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 6:
          localcnb.wOs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 7:
          localcnb.wOt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 8:
          localcnb.wOv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 9:
          localcnb.xkA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 10:
          localcnb.xkB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        case 11:
          localcnb.wOu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56992);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56992);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnb
 * JD-Core Version:    0.6.2
 */