package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ajv extends bsr
{
  public String mvO;
  public String mvP;
  public String mvQ;
  public String vAN;
  public xa vBe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28439);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.mvO != null)
        paramArrayOfObject.e(2, this.mvO);
      if (this.mvP != null)
        paramArrayOfObject.e(3, this.mvP);
      if (this.mvQ != null)
        paramArrayOfObject.e(4, this.mvQ);
      if (this.vAN != null)
        paramArrayOfObject.e(5, this.vAN);
      if (this.vBe != null)
      {
        paramArrayOfObject.iy(6, this.vBe.computeSize());
        this.vBe.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28439);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label748;
    label748: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mvO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mvO);
      i = paramInt;
      if (this.mvP != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mvP);
      paramInt = i;
      if (this.mvQ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.mvQ);
      i = paramInt;
      if (this.vAN != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vAN);
      paramInt = i;
      if (this.vBe != null)
        paramInt = i + e.a.a.a.ix(6, this.vBe.computeSize());
      AppMethodBeat.o(28439);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28439);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ajv localajv = (ajv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28439);
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
            localajv.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28439);
          paramInt = i;
          break;
        case 2:
          localajv.mvO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28439);
          paramInt = i;
          break;
        case 3:
          localajv.mvP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28439);
          paramInt = i;
          break;
        case 4:
          localajv.mvQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28439);
          paramInt = i;
          break;
        case 5:
          localajv.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28439);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xa();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xa)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localajv.vBe = ((xa)localObject1);
          }
          AppMethodBeat.o(28439);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28439);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ajv
 * JD-Core Version:    0.6.2
 */