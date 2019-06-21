package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class fv extends com.tencent.mm.bt.a
{
  public int luF;
  public String vCp;
  public xu vHF;
  public SKBuiltinBuffer_t vHG;
  public SKBuiltinBuffer_t vHH;
  public int vHI;
  public SKBuiltinBuffer_t vHJ;
  public cse vHK;
  public cwe vHL;
  public SKBuiltinBuffer_t vHM;
  public SKBuiltinBuffer_t vHN;
  public String vHO;
  public SKBuiltinBuffer_t vHP;
  public String vHQ;
  public bzr vHR;
  public String vHS;
  public int vHT;
  public int vHU;
  public int vHV;
  public int vHW;
  public int vHX;
  public SKBuiltinBuffer_t vHY;
  public SKBuiltinBuffer_t vHZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58886);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SvrPubECDHKey");
        AppMethodBeat.o(58886);
        throw paramArrayOfObject;
      }
      if (this.vHG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SessionKey");
        AppMethodBeat.o(58886);
        throw paramArrayOfObject;
      }
      if (this.vHH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AutoAuthKey");
        AppMethodBeat.o(58886);
        throw paramArrayOfObject;
      }
      if (this.vHY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ClientSessionKey");
        AppMethodBeat.o(58886);
        throw paramArrayOfObject;
      }
      if (this.vHZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ServerSessionKey");
        AppMethodBeat.o(58886);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.luF);
      if (this.vHF != null)
      {
        paramArrayOfObject.iy(2, this.vHF.computeSize());
        this.vHF.writeFields(paramArrayOfObject);
      }
      if (this.vHG != null)
      {
        paramArrayOfObject.iy(3, this.vHG.computeSize());
        this.vHG.writeFields(paramArrayOfObject);
      }
      if (this.vHH != null)
      {
        paramArrayOfObject.iy(4, this.vHH.computeSize());
        this.vHH.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.vHI);
      if (this.vHJ != null)
      {
        paramArrayOfObject.iy(6, this.vHJ.computeSize());
        this.vHJ.writeFields(paramArrayOfObject);
      }
      if (this.vHK != null)
      {
        paramArrayOfObject.iy(7, this.vHK.computeSize());
        this.vHK.writeFields(paramArrayOfObject);
      }
      if (this.vHL != null)
      {
        paramArrayOfObject.iy(8, this.vHL.computeSize());
        this.vHL.writeFields(paramArrayOfObject);
      }
      if (this.vHM != null)
      {
        paramArrayOfObject.iy(9, this.vHM.computeSize());
        this.vHM.writeFields(paramArrayOfObject);
      }
      if (this.vHN != null)
      {
        paramArrayOfObject.iy(10, this.vHN.computeSize());
        this.vHN.writeFields(paramArrayOfObject);
      }
      if (this.vHO != null)
        paramArrayOfObject.e(11, this.vHO);
      if (this.vHP != null)
      {
        paramArrayOfObject.iy(12, this.vHP.computeSize());
        this.vHP.writeFields(paramArrayOfObject);
      }
      if (this.vHQ != null)
        paramArrayOfObject.e(14, this.vHQ);
      if (this.vHR != null)
      {
        paramArrayOfObject.iy(15, this.vHR.computeSize());
        this.vHR.writeFields(paramArrayOfObject);
      }
      if (this.vHS != null)
        paramArrayOfObject.e(16, this.vHS);
      paramArrayOfObject.iz(17, this.vHT);
      paramArrayOfObject.iz(18, this.vHU);
      paramArrayOfObject.iz(19, this.vHV);
      if (this.vCp != null)
        paramArrayOfObject.e(20, this.vCp);
      paramArrayOfObject.iz(21, this.vHW);
      paramArrayOfObject.iz(22, this.vHX);
      if (this.vHY != null)
      {
        paramArrayOfObject.iy(23, this.vHY.computeSize());
        this.vHY.writeFields(paramArrayOfObject);
      }
      if (this.vHZ != null)
      {
        paramArrayOfObject.iy(24, this.vHZ.computeSize());
        this.vHZ.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58886);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.luF) + 0;
        i = paramInt;
        if (this.vHF != null)
          i = paramInt + e.a.a.a.ix(2, this.vHF.computeSize());
        paramInt = i;
        if (this.vHG != null)
          paramInt = i + e.a.a.a.ix(3, this.vHG.computeSize());
        i = paramInt;
        if (this.vHH != null)
          i = paramInt + e.a.a.a.ix(4, this.vHH.computeSize());
        i += e.a.a.b.b.a.bs(5, this.vHI);
        paramInt = i;
        if (this.vHJ != null)
          paramInt = i + e.a.a.a.ix(6, this.vHJ.computeSize());
        i = paramInt;
        if (this.vHK != null)
          i = paramInt + e.a.a.a.ix(7, this.vHK.computeSize());
        paramInt = i;
        if (this.vHL != null)
          paramInt = i + e.a.a.a.ix(8, this.vHL.computeSize());
        i = paramInt;
        if (this.vHM != null)
          i = paramInt + e.a.a.a.ix(9, this.vHM.computeSize());
        paramInt = i;
        if (this.vHN != null)
          paramInt = i + e.a.a.a.ix(10, this.vHN.computeSize());
        int j = paramInt;
        if (this.vHO != null)
          j = paramInt + e.a.a.b.b.a.f(11, this.vHO);
        i = j;
        if (this.vHP != null)
          i = j + e.a.a.a.ix(12, this.vHP.computeSize());
        paramInt = i;
        if (this.vHQ != null)
          paramInt = i + e.a.a.b.b.a.f(14, this.vHQ);
        i = paramInt;
        if (this.vHR != null)
          i = paramInt + e.a.a.a.ix(15, this.vHR.computeSize());
        paramInt = i;
        if (this.vHS != null)
          paramInt = i + e.a.a.b.b.a.f(16, this.vHS);
        i = paramInt + e.a.a.b.b.a.bs(17, this.vHT) + e.a.a.b.b.a.bs(18, this.vHU) + e.a.a.b.b.a.bs(19, this.vHV);
        paramInt = i;
        if (this.vCp != null)
          paramInt = i + e.a.a.b.b.a.f(20, this.vCp);
        i = paramInt + e.a.a.b.b.a.bs(21, this.vHW) + e.a.a.b.b.a.bs(22, this.vHX);
        paramInt = i;
        if (this.vHY != null)
          paramInt = i + e.a.a.a.ix(23, this.vHY.computeSize());
        i = paramInt;
        if (this.vHZ != null)
          i = paramInt + e.a.a.a.ix(24, this.vHZ.computeSize());
        AppMethodBeat.o(58886);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SvrPubECDHKey");
          AppMethodBeat.o(58886);
          throw paramArrayOfObject;
        }
        if (this.vHG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SessionKey");
          AppMethodBeat.o(58886);
          throw paramArrayOfObject;
        }
        if (this.vHH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AutoAuthKey");
          AppMethodBeat.o(58886);
          throw paramArrayOfObject;
        }
        if (this.vHY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ClientSessionKey");
          AppMethodBeat.o(58886);
          throw paramArrayOfObject;
        }
        if (this.vHZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ServerSessionKey");
          AppMethodBeat.o(58886);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58886);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fv localfv = (fv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 13:
        default:
          paramInt = -1;
          AppMethodBeat.o(58886);
          break;
        case 1:
          localfv.luF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHF = paramArrayOfObject;
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHG = paramArrayOfObject;
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHH = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 5:
          localfv.vHI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHJ = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHK = paramArrayOfObject;
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cwe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHL = paramArrayOfObject;
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHM = paramArrayOfObject;
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHN = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 11:
          localfv.vHO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHP = paramArrayOfObject;
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 14:
          localfv.vHQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 15:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHR = ((bzr)localObject1);
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 16:
          localfv.vHS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 17:
          localfv.vHT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 18:
          localfv.vHU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 19:
          localfv.vHV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 20:
          localfv.vCp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 21:
          localfv.vHW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 22:
          localfv.vHX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 23:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHY = paramArrayOfObject;
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        case 24:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfv.vHZ = paramArrayOfObject;
          }
          AppMethodBeat.o(58886);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(58886);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fv
 * JD-Core Version:    0.6.2
 */