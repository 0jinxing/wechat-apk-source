package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bap extends bsr
{
  public String ThumbUrl;
  public int nao;
  public String nbr;
  public int vRm;
  public int vRn;
  public String wEA;
  public String wEB;
  public String wEl;
  public String wEm;
  public String wEn;
  public int wEo;
  public SKBuiltinBuffer_t wEp;
  public int wEq;
  public int wEr;
  public int wEs;
  public int wEt;
  public SKBuiltinBuffer_t wEu;
  public int wEv;
  public int wEw;
  public int wEx;
  public int wEy;
  public int wEz;
  public int wqw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28548);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wEp == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DataBuffer");
        AppMethodBeat.o(28548);
        throw paramArrayOfObject;
      }
      if (this.wEu == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThumbData");
        AppMethodBeat.o(28548);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wEl != null)
        paramArrayOfObject.e(2, this.wEl);
      if (this.wEm != null)
        paramArrayOfObject.e(3, this.wEm);
      if (this.wEn != null)
        paramArrayOfObject.e(4, this.wEn);
      paramArrayOfObject.iz(5, this.nao);
      paramArrayOfObject.iz(6, this.wEo);
      if (this.wEp != null)
      {
        paramArrayOfObject.iy(7, this.wEp.computeSize());
        this.wEp.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.wEq);
      paramArrayOfObject.iz(9, this.wEr);
      paramArrayOfObject.iz(10, this.wEs);
      paramArrayOfObject.iz(11, this.wEt);
      if (this.wEu != null)
      {
        paramArrayOfObject.iy(12, this.wEu.computeSize());
        this.wEu.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(13, this.wEv);
      paramArrayOfObject.iz(14, this.wEw);
      paramArrayOfObject.iz(15, this.wEx);
      paramArrayOfObject.iz(16, this.wEy);
      paramArrayOfObject.iz(17, this.wqw);
      paramArrayOfObject.iz(18, this.wEz);
      if (this.nbr != null)
        paramArrayOfObject.e(19, this.nbr);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(20, this.ThumbUrl);
      paramArrayOfObject.iz(21, this.vRn);
      paramArrayOfObject.iz(22, this.vRm);
      if (this.wEA != null)
        paramArrayOfObject.e(23, this.wEA);
      if (this.wEB != null)
        paramArrayOfObject.e(24, this.wEB);
      AppMethodBeat.o(28548);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1886;
    label1886: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wEl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wEl);
      i = paramInt;
      if (this.wEm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wEm);
      paramInt = i;
      if (this.wEn != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wEn);
      i = paramInt + e.a.a.b.b.a.bs(5, this.nao) + e.a.a.b.b.a.bs(6, this.wEo);
      paramInt = i;
      if (this.wEp != null)
        paramInt = i + e.a.a.a.ix(7, this.wEp.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(8, this.wEq) + e.a.a.b.b.a.bs(9, this.wEr) + e.a.a.b.b.a.bs(10, this.wEs) + e.a.a.b.b.a.bs(11, this.wEt);
      paramInt = i;
      if (this.wEu != null)
        paramInt = i + e.a.a.a.ix(12, this.wEu.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(13, this.wEv) + e.a.a.b.b.a.bs(14, this.wEw) + e.a.a.b.b.a.bs(15, this.wEx) + e.a.a.b.b.a.bs(16, this.wEy) + e.a.a.b.b.a.bs(17, this.wqw) + e.a.a.b.b.a.bs(18, this.wEz);
      paramInt = i;
      if (this.nbr != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.nbr);
      i = paramInt;
      if (this.ThumbUrl != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.ThumbUrl);
      i = i + e.a.a.b.b.a.bs(21, this.vRn) + e.a.a.b.b.a.bs(22, this.vRm);
      paramInt = i;
      if (this.wEA != null)
        paramInt = i + e.a.a.b.b.a.f(23, this.wEA);
      i = paramInt;
      if (this.wEB != null)
        i = paramInt + e.a.a.b.b.a.f(24, this.wEB);
      AppMethodBeat.o(28548);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wEp == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DataBuffer");
          AppMethodBeat.o(28548);
          throw paramArrayOfObject;
        }
        if (this.wEu == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThumbData");
          AppMethodBeat.o(28548);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28548);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bap localbap = (bap)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28548);
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
            localbap.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 2:
          localbap.wEl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 3:
          localbap.wEm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 4:
          localbap.wEn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 5:
          localbap.nao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 6:
          localbap.wEo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbap.wEp = paramArrayOfObject;
          }
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 8:
          localbap.wEq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 9:
          localbap.wEr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 10:
          localbap.wEs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 11:
          localbap.wEt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbap.wEu = paramArrayOfObject;
          }
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 13:
          localbap.wEv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 14:
          localbap.wEw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 15:
          localbap.wEx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 16:
          localbap.wEy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 17:
          localbap.wqw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 18:
          localbap.wEz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 19:
          localbap.nbr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 20:
          localbap.ThumbUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 21:
          localbap.vRn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 22:
          localbap.vRm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 23:
          localbap.wEA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        case 24:
          localbap.wEB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28548);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28548);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bap
 * JD-Core Version:    0.6.2
 */