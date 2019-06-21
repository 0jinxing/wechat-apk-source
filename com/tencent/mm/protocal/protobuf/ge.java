package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ge extends bsr
{
  public String guQ;
  public String jBF;
  public String luP;
  public String luQ;
  public String nqc;
  public int vAM;
  public SKBuiltinBuffer_t vHH;
  public hh vIg;
  public String vIh;
  public int vIi;
  public String vIj;
  public String vIk;
  public SKBuiltinBuffer_t vIl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58887);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AutoAuthKey");
        AppMethodBeat.o(58887);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vIg != null)
      {
        paramArrayOfObject.iy(2, this.vIg.computeSize());
        this.vIg.writeFields(paramArrayOfObject);
      }
      if (this.vHH != null)
      {
        paramArrayOfObject.iy(3, this.vHH.computeSize());
        this.vHH.writeFields(paramArrayOfObject);
      }
      if (this.nqc != null)
        paramArrayOfObject.e(4, this.nqc);
      if (this.vIh != null)
        paramArrayOfObject.e(5, this.vIh);
      paramArrayOfObject.iz(6, this.vIi);
      if (this.vIj != null)
        paramArrayOfObject.e(7, this.vIj);
      if (this.guQ != null)
        paramArrayOfObject.e(8, this.guQ);
      if (this.jBF != null)
        paramArrayOfObject.e(9, this.jBF);
      if (this.vIk != null)
        paramArrayOfObject.e(10, this.vIk);
      if (this.luQ != null)
        paramArrayOfObject.e(11, this.luQ);
      if (this.luP != null)
        paramArrayOfObject.e(12, this.luP);
      paramArrayOfObject.iz(13, this.vAM);
      if (this.vIl != null)
      {
        paramArrayOfObject.iy(14, this.vIl.computeSize());
        this.vIl.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58887);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1461;
    label1461: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vIg != null)
        paramInt = i + e.a.a.a.ix(2, this.vIg.computeSize());
      i = paramInt;
      if (this.vHH != null)
        i = paramInt + e.a.a.a.ix(3, this.vHH.computeSize());
      paramInt = i;
      if (this.nqc != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nqc);
      i = paramInt;
      if (this.vIh != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vIh);
      paramInt = i + e.a.a.b.b.a.bs(6, this.vIi);
      i = paramInt;
      if (this.vIj != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vIj);
      paramInt = i;
      if (this.guQ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.guQ);
      i = paramInt;
      if (this.jBF != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.jBF);
      paramInt = i;
      if (this.vIk != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vIk);
      i = paramInt;
      if (this.luQ != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.luQ);
      paramInt = i;
      if (this.luP != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.luP);
      i = paramInt + e.a.a.b.b.a.bs(13, this.vAM);
      paramInt = i;
      if (this.vIl != null)
        paramInt = i + e.a.a.a.ix(14, this.vIl.computeSize());
      AppMethodBeat.o(58887);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AutoAuthKey");
          AppMethodBeat.o(58887);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58887);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ge localge = (ge)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58887);
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
            localge.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localge.vIg = paramArrayOfObject;
          }
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localge.vHH = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 4:
          localge.nqc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 5:
          localge.vIh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 6:
          localge.vIi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 7:
          localge.vIj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 8:
          localge.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 9:
          localge.jBF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 10:
          localge.vIk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 11:
          localge.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 12:
          localge.luP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 13:
          localge.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localge.vIl = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58887);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58887);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ge
 * JD-Core Version:    0.6.2
 */