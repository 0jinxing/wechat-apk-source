package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aa extends bsr
{
  public int OpCode;
  public String SSID;
  public String URL;
  public String vAI;
  public String vAJ;
  public String vAK;
  public LinkedList<dh> vAL;
  public int vAM;
  public String vAN;
  public int vAO;
  public String vAP;

  public aa()
  {
    AppMethodBeat.i(28291);
    this.vAL = new LinkedList();
    AppMethodBeat.o(28291);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28292);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.URL != null)
        paramArrayOfObject.e(2, this.URL);
      if (this.SSID != null)
        paramArrayOfObject.e(3, this.SSID);
      if (this.vAI != null)
        paramArrayOfObject.e(4, this.vAI);
      if (this.vAJ != null)
        paramArrayOfObject.e(5, this.vAJ);
      if (this.vAK != null)
        paramArrayOfObject.e(6, this.vAK);
      paramArrayOfObject.iz(7, this.OpCode);
      paramArrayOfObject.e(8, 8, this.vAL);
      paramArrayOfObject.iz(9, this.vAM);
      if (this.vAN != null)
        paramArrayOfObject.e(10, this.vAN);
      paramArrayOfObject.iz(11, this.vAO);
      if (this.vAP != null)
        paramArrayOfObject.e(12, this.vAP);
      AppMethodBeat.o(28292);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1084;
    label1084: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.URL != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.URL);
      int j = paramInt;
      if (this.SSID != null)
        j = paramInt + e.a.a.b.b.a.f(3, this.SSID);
      i = j;
      if (this.vAI != null)
        i = j + e.a.a.b.b.a.f(4, this.vAI);
      paramInt = i;
      if (this.vAJ != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vAJ);
      i = paramInt;
      if (this.vAK != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vAK);
      i = i + e.a.a.b.b.a.bs(7, this.OpCode) + e.a.a.a.c(8, 8, this.vAL) + e.a.a.b.b.a.bs(9, this.vAM);
      paramInt = i;
      if (this.vAN != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vAN);
      i = paramInt + e.a.a.b.b.a.bs(11, this.vAO);
      paramInt = i;
      if (this.vAP != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vAP);
      AppMethodBeat.o(28292);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vAL.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28292);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aa localaa = (aa)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28292);
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
            localaa.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 2:
          localaa.URL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 3:
          localaa.SSID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 4:
          localaa.vAI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 5:
          localaa.vAJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 6:
          localaa.vAK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 7:
          localaa.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new dh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaa.vAL.add(localObject1);
          }
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 9:
          localaa.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 10:
          localaa.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 11:
          localaa.vAO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        case 12:
          localaa.vAP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28292);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28292);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aa
 * JD-Core Version:    0.6.2
 */