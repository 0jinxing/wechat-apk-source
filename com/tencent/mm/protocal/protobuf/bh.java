package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bh extends bsr
{
  public String bssid;
  public int cvd;
  public String qEg;
  public int scene;
  public String ssid;
  public b vDA;
  public b vDB;
  public int vDs;
  public String vDt;
  public long vDu;
  public bt vDv;
  public int vDw;
  public int vDx;
  public String vDy;
  public int vDz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94491);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.qEg != null)
        paramArrayOfObject.e(2, this.qEg);
      paramArrayOfObject.iz(3, this.vDs);
      if (this.vDt != null)
        paramArrayOfObject.e(4, this.vDt);
      paramArrayOfObject.iz(5, this.scene);
      if (this.ssid != null)
        paramArrayOfObject.e(6, this.ssid);
      if (this.bssid != null)
        paramArrayOfObject.e(7, this.bssid);
      paramArrayOfObject.ai(8, this.vDu);
      if (this.vDv != null)
      {
        paramArrayOfObject.iy(9, this.vDv.computeSize());
        this.vDv.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(10, this.vDw);
      paramArrayOfObject.iz(11, this.vDx);
      paramArrayOfObject.iz(12, this.cvd);
      if (this.vDy != null)
        paramArrayOfObject.e(13, this.vDy);
      paramArrayOfObject.iz(14, this.vDz);
      if (this.vDA != null)
        paramArrayOfObject.c(15, this.vDA);
      if (this.vDB != null)
        paramArrayOfObject.c(16, this.vDB);
      AppMethodBeat.o(94491);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1272;
    label1272: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.qEg != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.qEg);
      i += e.a.a.b.b.a.bs(3, this.vDs);
      paramInt = i;
      if (this.vDt != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vDt);
      i = paramInt + e.a.a.b.b.a.bs(5, this.scene);
      paramInt = i;
      if (this.ssid != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.ssid);
      i = paramInt;
      if (this.bssid != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.bssid);
      i += e.a.a.b.b.a.o(8, this.vDu);
      paramInt = i;
      if (this.vDv != null)
        paramInt = i + e.a.a.a.ix(9, this.vDv.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(10, this.vDw) + e.a.a.b.b.a.bs(11, this.vDx) + e.a.a.b.b.a.bs(12, this.cvd);
      paramInt = i;
      if (this.vDy != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.vDy);
      i = paramInt + e.a.a.b.b.a.bs(14, this.vDz);
      paramInt = i;
      if (this.vDA != null)
        paramInt = i + e.a.a.b.b.a.b(15, this.vDA);
      i = paramInt;
      if (this.vDB != null)
        i = paramInt + e.a.a.b.b.a.b(16, this.vDB);
      AppMethodBeat.o(94491);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94491);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bh localbh = (bh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94491);
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
            localbh.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 2:
          localbh.qEg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 3:
          localbh.vDs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 4:
          localbh.vDt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 5:
          localbh.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 6:
          localbh.ssid = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 7:
          localbh.bssid = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 8:
          localbh.vDu = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbh.vDv = paramArrayOfObject;
          }
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 10:
          localbh.vDw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 11:
          localbh.vDx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 12:
          localbh.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 13:
          localbh.vDy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 14:
          localbh.vDz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 15:
          localbh.vDA = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        case 16:
          localbh.vDB = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(94491);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94491);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bh
 * JD-Core Version:    0.6.2
 */