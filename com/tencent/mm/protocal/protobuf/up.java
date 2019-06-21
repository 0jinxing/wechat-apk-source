package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class up extends bsr
{
  public int Scene;
  public int ehB;
  public LinkedList<bay> vEh;
  public bts wcc;
  public SKBuiltinBuffer_t wcd;

  public up()
  {
    AppMethodBeat.i(5568);
    this.vEh = new LinkedList();
    AppMethodBeat.o(5568);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5569);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Topic");
        AppMethodBeat.o(5569);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wcc != null)
      {
        paramArrayOfObject.iy(2, this.wcc.computeSize());
        this.wcc.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.ehB);
      paramArrayOfObject.e(4, 8, this.vEh);
      paramArrayOfObject.iz(5, this.Scene);
      if (this.wcd != null)
      {
        paramArrayOfObject.iy(6, this.wcd.computeSize());
        this.wcd.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(5569);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label939;
    label939: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wcc != null)
        i = paramInt + e.a.a.a.ix(2, this.wcc.computeSize());
      i = i + e.a.a.b.b.a.bs(3, this.ehB) + e.a.a.a.c(4, 8, this.vEh) + e.a.a.b.b.a.bs(5, this.Scene);
      paramInt = i;
      if (this.wcd != null)
        paramInt = i + e.a.a.a.ix(6, this.wcd.computeSize());
      AppMethodBeat.o(5569);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Topic");
          AppMethodBeat.o(5569);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5569);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        up localup = (up)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5569);
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
            localup.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5569);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localup.wcc = paramArrayOfObject;
          }
          AppMethodBeat.o(5569);
          paramInt = i;
          break;
        case 3:
          localup.ehB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5569);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bay();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bay)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localup.vEh.add(localObject1);
          }
          AppMethodBeat.o(5569);
          paramInt = i;
          break;
        case 5:
          localup.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5569);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localup.wcd = paramArrayOfObject;
          }
          AppMethodBeat.o(5569);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5569);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.up
 * JD-Core Version:    0.6.2
 */