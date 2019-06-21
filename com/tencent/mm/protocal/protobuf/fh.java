package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class fh extends com.tencent.mm.bt.a
{
  public fi vHg;
  public fj vHm;
  public com.tencent.mm.bt.b vHn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28320);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHm == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: VoiceAttr");
        AppMethodBeat.o(28320);
        throw paramArrayOfObject;
      }
      if (this.vHg == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: UploadCtx");
        AppMethodBeat.o(28320);
        throw paramArrayOfObject;
      }
      if (this.vHn == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: VoiceData");
        AppMethodBeat.o(28320);
        throw paramArrayOfObject;
      }
      if (this.vHm != null)
      {
        paramArrayOfObject.iy(1, this.vHm.computeSize());
        this.vHm.writeFields(paramArrayOfObject);
      }
      if (this.vHg != null)
      {
        paramArrayOfObject.iy(2, this.vHg.computeSize());
        this.vHg.writeFields(paramArrayOfObject);
      }
      if (this.vHn != null)
        paramArrayOfObject.c(3, this.vHn);
      AppMethodBeat.o(28320);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vHm == null)
        break label707;
    label707: for (i = e.a.a.a.ix(1, this.vHm.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vHg != null)
        paramInt = i + e.a.a.a.ix(2, this.vHg.computeSize());
      i = paramInt;
      if (this.vHn != null)
        i = paramInt + e.a.a.b.b.a.b(3, this.vHn);
      AppMethodBeat.o(28320);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHm == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: VoiceAttr");
          AppMethodBeat.o(28320);
          throw paramArrayOfObject;
        }
        if (this.vHg == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: UploadCtx");
          AppMethodBeat.o(28320);
          throw paramArrayOfObject;
        }
        if (this.vHn == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: VoiceData");
          AppMethodBeat.o(28320);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28320);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fh localfh = (fh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28320);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new fj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfh.vHm = ((fj)localObject1);
          }
          AppMethodBeat.o(28320);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new fi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfh.vHg = paramArrayOfObject;
          }
          AppMethodBeat.o(28320);
          paramInt = i;
          break;
        case 3:
          localfh.vHn = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(28320);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28320);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fh
 * JD-Core Version:    0.6.2
 */