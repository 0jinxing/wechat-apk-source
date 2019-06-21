package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bin extends bsr
{
  public String fKh;
  public String mZu;
  public String ncH;
  public aw vRP;
  public String vYO;
  public String vYP;
  public String vYQ;
  public String vYR;
  public String wLU;
  public String wLV;
  public String wLW;
  public String wLX;
  public String wLY;
  public String wlb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56876);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.wLU != null)
        paramArrayOfObject.e(3, this.wLU);
      if (this.wlb != null)
        paramArrayOfObject.e(4, this.wlb);
      if (this.vYO != null)
        paramArrayOfObject.e(5, this.vYO);
      if (this.wLV != null)
        paramArrayOfObject.e(6, this.wLV);
      if (this.vYP != null)
        paramArrayOfObject.e(7, this.vYP);
      if (this.vYQ != null)
        paramArrayOfObject.e(8, this.vYQ);
      if (this.vYR != null)
        paramArrayOfObject.e(9, this.vYR);
      if (this.wLW != null)
        paramArrayOfObject.e(10, this.wLW);
      if (this.vRP != null)
      {
        paramArrayOfObject.iy(11, this.vRP.computeSize());
        this.vRP.writeFields(paramArrayOfObject);
      }
      if (this.wLX != null)
        paramArrayOfObject.e(12, this.wLX);
      if (this.mZu != null)
        paramArrayOfObject.e(13, this.mZu);
      if (this.ncH != null)
        paramArrayOfObject.e(14, this.ncH);
      if (this.wLY != null)
        paramArrayOfObject.e(15, this.wLY);
      AppMethodBeat.o(56876);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1326;
    label1326: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
      i = paramInt;
      if (this.wLU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wLU);
      paramInt = i;
      if (this.wlb != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wlb);
      i = paramInt;
      if (this.vYO != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vYO);
      paramInt = i;
      if (this.wLV != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wLV);
      i = paramInt;
      if (this.vYP != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vYP);
      paramInt = i;
      if (this.vYQ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vYQ);
      i = paramInt;
      if (this.vYR != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vYR);
      paramInt = i;
      if (this.wLW != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wLW);
      i = paramInt;
      if (this.vRP != null)
        i = paramInt + e.a.a.a.ix(11, this.vRP.computeSize());
      int j = i;
      if (this.wLX != null)
        j = i + e.a.a.b.b.a.f(12, this.wLX);
      paramInt = j;
      if (this.mZu != null)
        paramInt = j + e.a.a.b.b.a.f(13, this.mZu);
      i = paramInt;
      if (this.ncH != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.ncH);
      paramInt = i;
      if (this.wLY != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wLY);
      AppMethodBeat.o(56876);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56876);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bin localbin = (bin)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56876);
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
            localbin.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 2:
          localbin.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 3:
          localbin.wLU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 4:
          localbin.wlb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 5:
          localbin.vYO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 6:
          localbin.wLV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 7:
          localbin.vYP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 8:
          localbin.vYQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 9:
          localbin.vYR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 10:
          localbin.wLW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbin.vRP = ((aw)localObject1);
          }
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 12:
          localbin.wLX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 13:
          localbin.mZu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 14:
          localbin.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        case 15:
          localbin.wLY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56876);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56876);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bin
 * JD-Core Version:    0.6.2
 */