package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bm extends bsr
{
  public String bssid;
  public int cvd;
  public String qEg;
  public int scene;
  public String ssid;
  public int type;
  public b vDA;
  public b vDB;
  public int vDK;
  public bl vDL;
  public bo vDM;
  public int vDN;
  public int vDO;
  public int vDP;
  public String vDt;
  public long vDu;
  public int vDw;
  public String vDy;
  public int vDz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94497);
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
      paramArrayOfObject.iz(3, this.scene);
      paramArrayOfObject.iz(4, this.type);
      paramArrayOfObject.iz(5, this.vDK);
      if (this.ssid != null)
        paramArrayOfObject.e(6, this.ssid);
      if (this.bssid != null)
        paramArrayOfObject.e(7, this.bssid);
      paramArrayOfObject.ai(8, this.vDu);
      if (this.vDL != null)
      {
        paramArrayOfObject.iy(9, this.vDL.computeSize());
        this.vDL.writeFields(paramArrayOfObject);
      }
      if (this.vDM != null)
      {
        paramArrayOfObject.iy(10, this.vDM.computeSize());
        this.vDM.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.vDw);
      if (this.vDt != null)
        paramArrayOfObject.e(12, this.vDt);
      paramArrayOfObject.iz(13, this.cvd);
      if (this.vDy != null)
        paramArrayOfObject.e(14, this.vDy);
      paramArrayOfObject.iz(15, this.vDN);
      paramArrayOfObject.iz(16, this.vDO);
      paramArrayOfObject.iz(17, this.vDP);
      paramArrayOfObject.iz(18, this.vDz);
      if (this.vDA != null)
        paramArrayOfObject.c(19, this.vDA);
      if (this.vDB != null)
        paramArrayOfObject.c(20, this.vDB);
      AppMethodBeat.o(94497);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1575;
    label1575: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.qEg != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.qEg);
      i = i + e.a.a.b.b.a.bs(3, this.scene) + e.a.a.b.b.a.bs(4, this.type) + e.a.a.b.b.a.bs(5, this.vDK);
      paramInt = i;
      if (this.ssid != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.ssid);
      i = paramInt;
      if (this.bssid != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.bssid);
      i += e.a.a.b.b.a.o(8, this.vDu);
      paramInt = i;
      if (this.vDL != null)
        paramInt = i + e.a.a.a.ix(9, this.vDL.computeSize());
      i = paramInt;
      if (this.vDM != null)
        i = paramInt + e.a.a.a.ix(10, this.vDM.computeSize());
      i += e.a.a.b.b.a.bs(11, this.vDw);
      paramInt = i;
      if (this.vDt != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vDt);
      i = paramInt + e.a.a.b.b.a.bs(13, this.cvd);
      paramInt = i;
      if (this.vDy != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.vDy);
      i = paramInt + e.a.a.b.b.a.bs(15, this.vDN) + e.a.a.b.b.a.bs(16, this.vDO) + e.a.a.b.b.a.bs(17, this.vDP) + e.a.a.b.b.a.bs(18, this.vDz);
      paramInt = i;
      if (this.vDA != null)
        paramInt = i + e.a.a.b.b.a.b(19, this.vDA);
      i = paramInt;
      if (this.vDB != null)
        i = paramInt + e.a.a.b.b.a.b(20, this.vDB);
      AppMethodBeat.o(94497);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94497);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bm localbm = (bm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94497);
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
            localbm.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 2:
          localbm.qEg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 3:
          localbm.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 4:
          localbm.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 5:
          localbm.vDK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 6:
          localbm.ssid = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 7:
          localbm.bssid = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 8:
          localbm.vDu = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbm.vDL = ((bl)localObject1);
          }
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbm.vDM = ((bo)localObject1);
          }
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 11:
          localbm.vDw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 12:
          localbm.vDt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 13:
          localbm.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 14:
          localbm.vDy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 15:
          localbm.vDN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 16:
          localbm.vDO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 17:
          localbm.vDP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 18:
          localbm.vDz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 19:
          localbm.vDA = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        case 20:
          localbm.vDB = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(94497);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94497);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bm
 * JD-Core Version:    0.6.2
 */