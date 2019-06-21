package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ado extends bsr
{
  public int OpCode;
  public int Scene;
  public String jBB;
  public int vEq;
  public int vGB;
  public SKBuiltinBuffer_t vHP;
  public int vIw;
  public String vKt;
  public int vXI;
  public int vXJ;
  public bts wlk;
  public bts wll;
  public bts wlm;
  public bts wln;
  public String wlo;
  public int wlp;
  public String wlq;
  public SKBuiltinBuffer_t wlr;
  public int wls;
  public int wlt;
  public String wlu;
  public int wlv;
  public SKBuiltinBuffer_t wlw;
  public String wlx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80054);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.OpCode);
      if (this.vHP != null)
      {
        paramArrayOfObject.iy(3, this.vHP.computeSize());
        this.vHP.writeFields(paramArrayOfObject);
      }
      if (this.wlk != null)
      {
        paramArrayOfObject.iy(4, this.wlk.computeSize());
        this.wlk.writeFields(paramArrayOfObject);
      }
      if (this.wll != null)
      {
        paramArrayOfObject.iy(5, this.wll.computeSize());
        this.wll.writeFields(paramArrayOfObject);
      }
      if (this.wlm != null)
      {
        paramArrayOfObject.iy(6, this.wlm.computeSize());
        this.wlm.writeFields(paramArrayOfObject);
      }
      if (this.wln != null)
      {
        paramArrayOfObject.iy(7, this.wln.computeSize());
        this.wln.writeFields(paramArrayOfObject);
      }
      if (this.wlo != null)
        paramArrayOfObject.e(8, this.wlo);
      paramArrayOfObject.iz(9, this.wlp);
      paramArrayOfObject.iz(10, this.Scene);
      if (this.jBB != null)
        paramArrayOfObject.e(11, this.jBB);
      if (this.wlq != null)
        paramArrayOfObject.e(12, this.wlq);
      if (this.wlr != null)
      {
        paramArrayOfObject.iy(13, this.wlr.computeSize());
        this.wlr.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(14, this.vIw);
      paramArrayOfObject.iz(15, this.wls);
      paramArrayOfObject.iz(16, this.vEq);
      if (this.vKt != null)
        paramArrayOfObject.e(17, this.vKt);
      paramArrayOfObject.iz(18, this.vXI);
      paramArrayOfObject.iz(19, this.vXJ);
      paramArrayOfObject.iz(20, this.wlt);
      if (this.wlu != null)
        paramArrayOfObject.e(21, this.wlu);
      paramArrayOfObject.iz(22, this.wlv);
      if (this.wlw != null)
      {
        paramArrayOfObject.iy(23, this.wlw.computeSize());
        this.wlw.writeFields(paramArrayOfObject);
      }
      if (this.wlx != null)
        paramArrayOfObject.e(24, this.wlx);
      paramArrayOfObject.iz(25, this.vGB);
      AppMethodBeat.o(80054);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label2352;
    label2352: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.OpCode);
      paramInt = i;
      if (this.vHP != null)
        paramInt = i + e.a.a.a.ix(3, this.vHP.computeSize());
      i = paramInt;
      if (this.wlk != null)
        i = paramInt + e.a.a.a.ix(4, this.wlk.computeSize());
      paramInt = i;
      if (this.wll != null)
        paramInt = i + e.a.a.a.ix(5, this.wll.computeSize());
      i = paramInt;
      if (this.wlm != null)
        i = paramInt + e.a.a.a.ix(6, this.wlm.computeSize());
      paramInt = i;
      if (this.wln != null)
        paramInt = i + e.a.a.a.ix(7, this.wln.computeSize());
      i = paramInt;
      if (this.wlo != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wlo);
      paramInt = i + e.a.a.b.b.a.bs(9, this.wlp) + e.a.a.b.b.a.bs(10, this.Scene);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.jBB);
      paramInt = i;
      if (this.wlq != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wlq);
      i = paramInt;
      if (this.wlr != null)
        i = paramInt + e.a.a.a.ix(13, this.wlr.computeSize());
      i = i + e.a.a.b.b.a.bs(14, this.vIw) + e.a.a.b.b.a.bs(15, this.wls) + e.a.a.b.b.a.bs(16, this.vEq);
      paramInt = i;
      if (this.vKt != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.vKt);
      i = paramInt + e.a.a.b.b.a.bs(18, this.vXI) + e.a.a.b.b.a.bs(19, this.vXJ) + e.a.a.b.b.a.bs(20, this.wlt);
      paramInt = i;
      if (this.wlu != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.wlu);
      i = paramInt + e.a.a.b.b.a.bs(22, this.wlv);
      paramInt = i;
      if (this.wlw != null)
        paramInt = i + e.a.a.a.ix(23, this.wlw.computeSize());
      i = paramInt;
      if (this.wlx != null)
        i = paramInt + e.a.a.b.b.a.f(24, this.wlx);
      paramInt = i + e.a.a.b.b.a.bs(25, this.vGB);
      AppMethodBeat.o(80054);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80054);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ado localado = (ado)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80054);
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
            localado.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 2:
          localado.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
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
            localado.vHP = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localado.wlk = ((bts)localObject1);
          }
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localado.wll = paramArrayOfObject;
          }
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localado.wlm = ((bts)localObject1);
          }
          AppMethodBeat.o(80054);
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
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localado.wln = ((bts)localObject1);
          }
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 8:
          localado.wlo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 9:
          localado.wlp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 10:
          localado.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 11:
          localado.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 12:
          localado.wlq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80054);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localado.wlr = paramArrayOfObject;
          }
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 14:
          localado.vIw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 15:
          localado.wls = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 16:
          localado.vEq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 17:
          localado.vKt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 18:
          localado.vXI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 19:
          localado.vXJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 20:
          localado.wlt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 21:
          localado.wlu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 22:
          localado.wlv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 23:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localado.wlw = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 24:
          localado.wlx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        case 25:
          localado.vGB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80054);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80054);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ado
 * JD-Core Version:    0.6.2
 */