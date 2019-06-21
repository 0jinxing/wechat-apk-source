package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class axw extends com.tencent.mm.bt.a
{
  public String Title;
  public int jCt;
  public String oQU;
  public float oQV;
  public int oQW;
  public LinkedList<Integer> oQX;
  public int oQY;
  public LinkedList<bts> oQZ;
  public float oRa;
  public String oRb;
  public SKBuiltinBuffer_t oRc;
  public String wCb;
  public SKBuiltinBuffer_t wCc;
  public int wCd;
  public int wCe;

  public axw()
  {
    AppMethodBeat.i(70484);
    this.oQX = new LinkedList();
    this.oQZ = new LinkedList();
    AppMethodBeat.o(70484);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(70485);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.oQU != null)
        paramArrayOfObject.e(1, this.oQU);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      paramArrayOfObject.r(3, this.oQV);
      paramArrayOfObject.iz(4, this.oQW);
      paramArrayOfObject.f(5, 2, this.oQX);
      paramArrayOfObject.iz(6, this.oQY);
      paramArrayOfObject.e(7, 8, this.oQZ);
      paramArrayOfObject.r(8, this.oRa);
      if (this.oRb != null)
        paramArrayOfObject.e(9, this.oRb);
      paramArrayOfObject.iz(10, this.jCt);
      if (this.oRc != null)
      {
        paramArrayOfObject.iy(11, this.oRc.computeSize());
        this.oRc.writeFields(paramArrayOfObject);
      }
      if (this.wCb != null)
        paramArrayOfObject.e(12, this.wCb);
      if (this.wCc != null)
      {
        paramArrayOfObject.iy(13, this.wCc.computeSize());
        this.wCc.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(14, this.wCd);
      paramArrayOfObject.iz(15, this.wCe);
      AppMethodBeat.o(70485);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.oQU == null)
        break label1291;
    label1291: for (paramInt = e.a.a.b.b.a.f(1, this.oQU) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Title);
      i = i + (e.a.a.b.b.a.fv(3) + 4) + e.a.a.b.b.a.bs(4, this.oQW) + e.a.a.a.d(5, 2, this.oQX) + e.a.a.b.b.a.bs(6, this.oQY) + e.a.a.a.c(7, 8, this.oQZ) + (e.a.a.b.b.a.fv(8) + 4);
      paramInt = i;
      if (this.oRb != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.oRb);
      i = paramInt + e.a.a.b.b.a.bs(10, this.jCt);
      paramInt = i;
      if (this.oRc != null)
        paramInt = i + e.a.a.a.ix(11, this.oRc.computeSize());
      i = paramInt;
      if (this.wCb != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wCb);
      paramInt = i;
      if (this.wCc != null)
        paramInt = i + e.a.a.a.ix(13, this.wCc.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(14, this.wCd) + e.a.a.b.b.a.bs(15, this.wCe);
      AppMethodBeat.o(70485);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.oQX.clear();
        this.oQZ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(70485);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        axw localaxw = (axw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(70485);
          break;
        case 1:
          localaxw.oQU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 2:
          localaxw.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 3:
          localaxw.oQV = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 4:
          localaxw.oQW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 5:
          localaxw.oQX = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 6:
          localaxw.oQY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(70485);
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
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxw.oQZ.add(localObject1);
          }
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 8:
          localaxw.oRa = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 9:
          localaxw.oRb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 10:
          localaxw.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxw.oRc = paramArrayOfObject;
          }
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 12:
          localaxw.wCb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxw.wCc = paramArrayOfObject;
          }
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 14:
          localaxw.wCd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        case 15:
          localaxw.wCe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(70485);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(70485);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axw
 * JD-Core Version:    0.6.2
 */