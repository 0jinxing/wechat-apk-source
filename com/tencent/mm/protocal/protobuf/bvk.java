package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bvk extends com.tencent.mm.bt.a
{
  public String fKh;
  public int guN;
  public String jBB;
  public String jCH;
  public String vXm;
  public String vXn;
  public int wWh;
  public bgg wWy;
  public String wbs;
  public String wbt;
  public String wlF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80179);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.jCH != null)
        paramArrayOfObject.e(2, this.jCH);
      if (this.wbs != null)
        paramArrayOfObject.e(3, this.wbs);
      if (this.wbt != null)
        paramArrayOfObject.e(4, this.wbt);
      paramArrayOfObject.iz(5, this.guN);
      if (this.vXm != null)
        paramArrayOfObject.e(6, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(7, this.vXn);
      if (this.fKh != null)
        paramArrayOfObject.e(8, this.fKh);
      paramArrayOfObject.iz(9, this.wWh);
      if (this.wWy != null)
      {
        paramArrayOfObject.iy(10, this.wWy.computeSize());
        this.wWy.writeFields(paramArrayOfObject);
      }
      if (this.wlF != null)
        paramArrayOfObject.e(11, this.wlF);
      AppMethodBeat.o(80179);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label937;
    label937: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jCH != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jCH);
      paramInt = i;
      if (this.wbs != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wbs);
      i = paramInt;
      if (this.wbt != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wbt);
      i += e.a.a.b.b.a.bs(5, this.guN);
      paramInt = i;
      if (this.vXm != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vXm);
      i = paramInt;
      if (this.vXn != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vXn);
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.fKh);
      i = paramInt + e.a.a.b.b.a.bs(9, this.wWh);
      paramInt = i;
      if (this.wWy != null)
        paramInt = i + e.a.a.a.ix(10, this.wWy.computeSize());
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wlF);
      AppMethodBeat.o(80179);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80179);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bvk localbvk = (bvk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80179);
          break;
        case 1:
          localbvk.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 2:
          localbvk.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 3:
          localbvk.wbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 4:
          localbvk.wbt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 5:
          localbvk.guN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 6:
          localbvk.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 7:
          localbvk.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 8:
          localbvk.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 9:
          localbvk.wWh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bgg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbvk.wWy = paramArrayOfObject;
          }
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        case 11:
          localbvk.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80179);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80179);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bvk
 * JD-Core Version:    0.6.2
 */