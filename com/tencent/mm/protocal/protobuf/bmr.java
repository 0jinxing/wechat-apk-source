package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bmr extends bsr
{
  public long appid;
  public int cuy;
  public int platform;
  public int scene;
  public long vNx;
  public String wMv;
  public int wPC;
  public long wPD;
  public int wPE;
  public long wPF;
  public long wPG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11794);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wPC);
      paramArrayOfObject.ai(3, this.wPD);
      paramArrayOfObject.ai(4, this.appid);
      paramArrayOfObject.ai(5, this.vNx);
      paramArrayOfObject.iz(6, this.wPE);
      paramArrayOfObject.iz(7, this.scene);
      paramArrayOfObject.iz(8, this.cuy);
      paramArrayOfObject.ai(9, this.wPF);
      paramArrayOfObject.ai(10, this.wPG);
      paramArrayOfObject.iz(11, this.platform);
      if (this.wMv != null)
        paramArrayOfObject.e(12, this.wMv);
      AppMethodBeat.o(11794);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label870;
    label870: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wPC) + e.a.a.b.b.a.o(3, this.wPD) + e.a.a.b.b.a.o(4, this.appid) + e.a.a.b.b.a.o(5, this.vNx) + e.a.a.b.b.a.bs(6, this.wPE) + e.a.a.b.b.a.bs(7, this.scene) + e.a.a.b.b.a.bs(8, this.cuy) + e.a.a.b.b.a.o(9, this.wPF) + e.a.a.b.b.a.o(10, this.wPG) + e.a.a.b.b.a.bs(11, this.platform);
      paramInt = i;
      if (this.wMv != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wMv);
      AppMethodBeat.o(11794);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11794);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmr localbmr = (bmr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11794);
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
            localbmr.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 2:
          localbmr.wPC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 3:
          localbmr.wPD = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 4:
          localbmr.appid = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 5:
          localbmr.vNx = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 6:
          localbmr.wPE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 7:
          localbmr.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 8:
          localbmr.cuy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 9:
          localbmr.wPF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 10:
          localbmr.wPG = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 11:
          localbmr.platform = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        case 12:
          localbmr.wMv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11794);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11794);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmr
 * JD-Core Version:    0.6.2
 */