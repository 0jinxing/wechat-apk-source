package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bqt extends bsr
{
  public int jCt;
  public int nbj;
  public cmj wTf;
  public cie wTg;
  public String weu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(113789);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wTf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserPosition");
        AppMethodBeat.o(113789);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.weu != null)
        paramArrayOfObject.e(2, this.weu);
      paramArrayOfObject.iz(3, this.jCt);
      if (this.wTf != null)
      {
        paramArrayOfObject.iy(4, this.wTf.computeSize());
        this.wTf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.nbj);
      if (this.wTg != null)
      {
        paramArrayOfObject.iy(6, this.wTg.computeSize());
        this.wTg.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(113789);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label847;
    label847: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.weu != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.weu);
      i += e.a.a.b.b.a.bs(3, this.jCt);
      paramInt = i;
      if (this.wTf != null)
        paramInt = i + e.a.a.a.ix(4, this.wTf.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(5, this.nbj);
      paramInt = i;
      if (this.wTg != null)
        paramInt = i + e.a.a.a.ix(6, this.wTg.computeSize());
      AppMethodBeat.o(113789);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wTf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserPosition");
          AppMethodBeat.o(113789);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(113789);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqt localbqt = (bqt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(113789);
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
            localbqt.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(113789);
          paramInt = i;
          break;
        case 2:
          localbqt.weu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(113789);
          paramInt = i;
          break;
        case 3:
          localbqt.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113789);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cmj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cmj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqt.wTf = ((cmj)localObject1);
          }
          AppMethodBeat.o(113789);
          paramInt = i;
          break;
        case 5:
          localbqt.nbj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(113789);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cie();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqt.wTg = paramArrayOfObject;
          }
          AppMethodBeat.o(113789);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(113789);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqt
 * JD-Core Version:    0.6.2
 */