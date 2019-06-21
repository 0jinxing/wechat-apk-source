package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aoq extends bsr
{
  public String jCH;
  public String luQ;
  public String vIj;
  public SKBuiltinBuffer_t vLz;
  public String wsI;
  public String wsJ;
  public String wsK;
  public String wsL;
  public String wsM;
  public int wsN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73716);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
        AppMethodBeat.o(73716);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(2, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      if (this.wsI != null)
        paramArrayOfObject.e(3, this.wsI);
      if (this.wsJ != null)
        paramArrayOfObject.e(4, this.wsJ);
      if (this.jCH != null)
        paramArrayOfObject.e(5, this.jCH);
      if (this.wsK != null)
        paramArrayOfObject.e(6, this.wsK);
      if (this.wsL != null)
        paramArrayOfObject.e(7, this.wsL);
      if (this.wsM != null)
        paramArrayOfObject.e(8, this.wsM);
      paramArrayOfObject.iz(9, this.wsN);
      if (this.luQ != null)
        paramArrayOfObject.e(10, this.luQ);
      if (this.vIj != null)
        paramArrayOfObject.e(11, this.vIj);
      AppMethodBeat.o(73716);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1098;
    label1098: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vLz != null)
        paramInt = i + e.a.a.a.ix(2, this.vLz.computeSize());
      i = paramInt;
      if (this.wsI != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wsI);
      paramInt = i;
      if (this.wsJ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wsJ);
      int j = paramInt;
      if (this.jCH != null)
        j = paramInt + e.a.a.b.b.a.f(5, this.jCH);
      i = j;
      if (this.wsK != null)
        i = j + e.a.a.b.b.a.f(6, this.wsK);
      paramInt = i;
      if (this.wsL != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wsL);
      i = paramInt;
      if (this.wsM != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wsM);
      i += e.a.a.b.b.a.bs(9, this.wsN);
      paramInt = i;
      if (this.luQ != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.luQ);
      i = paramInt;
      if (this.vIj != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vIj);
      AppMethodBeat.o(73716);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vLz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
          AppMethodBeat.o(73716);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(73716);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aoq localaoq = (aoq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73716);
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
            localaoq.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaoq.vLz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 3:
          localaoq.wsI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 4:
          localaoq.wsJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 5:
          localaoq.jCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 6:
          localaoq.wsK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 7:
          localaoq.wsL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 8:
          localaoq.wsM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 9:
          localaoq.wsN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 10:
          localaoq.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        case 11:
          localaoq.vIj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73716);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73716);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aoq
 * JD-Core Version:    0.6.2
 */