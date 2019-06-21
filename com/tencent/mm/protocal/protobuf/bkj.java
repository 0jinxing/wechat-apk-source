package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bkj extends com.tencent.mm.bt.a
{
  public String mZV;
  public cvr wNv;
  public cvu wNw;
  public cvn wNx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(63690);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PkgId");
        AppMethodBeat.o(63690);
        throw paramArrayOfObject;
      }
      if (this.mZV != null)
        paramArrayOfObject.e(1, this.mZV);
      if (this.wNv != null)
      {
        paramArrayOfObject.iy(2, this.wNv.computeSize());
        this.wNv.writeFields(paramArrayOfObject);
      }
      if (this.wNw != null)
      {
        paramArrayOfObject.iy(3, this.wNw.computeSize());
        this.wNw.writeFields(paramArrayOfObject);
      }
      if (this.wNx != null)
      {
        paramArrayOfObject.iy(4, this.wNx.computeSize());
        this.wNx.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(63690);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZV == null)
        break label749;
    label749: for (i = e.a.a.b.b.a.f(1, this.mZV) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wNv != null)
        paramInt = i + e.a.a.a.ix(2, this.wNv.computeSize());
      i = paramInt;
      if (this.wNw != null)
        i = paramInt + e.a.a.a.ix(3, this.wNw.computeSize());
      paramInt = i;
      if (this.wNx != null)
        paramInt = i + e.a.a.a.ix(4, this.wNx.computeSize());
      AppMethodBeat.o(63690);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PkgId");
          AppMethodBeat.o(63690);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(63690);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bkj localbkj = (bkj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(63690);
          break;
        case 1:
          localbkj.mZV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(63690);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cvr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cvr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkj.wNv = ((cvr)localObject1);
          }
          AppMethodBeat.o(63690);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cvu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkj.wNw = paramArrayOfObject;
          }
          AppMethodBeat.o(63690);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cvn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbkj.wNx = paramArrayOfObject;
          }
          AppMethodBeat.o(63690);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(63690);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkj
 * JD-Core Version:    0.6.2
 */