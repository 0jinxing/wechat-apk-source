package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bmf extends bsr
{
  public long wOS;
  public bts wPi;
  public bts wPj;
  public bts wPk;
  public int wPl;
  public int wem;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28589);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wPi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ClientReport");
        AppMethodBeat.o(28589);
        throw paramArrayOfObject;
      }
      if (this.wPj == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ChannelReport");
        AppMethodBeat.o(28589);
        throw paramArrayOfObject;
      }
      if (this.wPk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: EngineReport");
        AppMethodBeat.o(28589);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wPi != null)
      {
        paramArrayOfObject.iy(2, this.wPi.computeSize());
        this.wPi.writeFields(paramArrayOfObject);
      }
      if (this.wPj != null)
      {
        paramArrayOfObject.iy(3, this.wPj.computeSize());
        this.wPj.writeFields(paramArrayOfObject);
      }
      if (this.wPk != null)
      {
        paramArrayOfObject.iy(4, this.wPk.computeSize());
        this.wPk.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wem);
      paramArrayOfObject.ai(6, this.wOS);
      paramArrayOfObject.iz(7, this.wPl);
      AppMethodBeat.o(28589);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1100;
    label1100: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wPi != null)
        i = paramInt + e.a.a.a.ix(2, this.wPi.computeSize());
      paramInt = i;
      if (this.wPj != null)
        paramInt = i + e.a.a.a.ix(3, this.wPj.computeSize());
      i = paramInt;
      if (this.wPk != null)
        i = paramInt + e.a.a.a.ix(4, this.wPk.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(5, this.wem) + e.a.a.b.b.a.o(6, this.wOS) + e.a.a.b.b.a.bs(7, this.wPl);
      AppMethodBeat.o(28589);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wPi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ClientReport");
          AppMethodBeat.o(28589);
          throw paramArrayOfObject;
        }
        if (this.wPj == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ChannelReport");
          AppMethodBeat.o(28589);
          throw paramArrayOfObject;
        }
        if (this.wPk == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: EngineReport");
          AppMethodBeat.o(28589);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28589);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmf localbmf = (bmf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28589);
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
            localbmf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28589);
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
            localbmf.wPi = paramArrayOfObject;
          }
          AppMethodBeat.o(28589);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbmf.wPj = ((bts)localObject1);
          }
          AppMethodBeat.o(28589);
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
            localbmf.wPk = ((bts)localObject1);
          }
          AppMethodBeat.o(28589);
          paramInt = i;
          break;
        case 5:
          localbmf.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28589);
          paramInt = i;
          break;
        case 6:
          localbmf.wOS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28589);
          paramInt = i;
          break;
        case 7:
          localbmf.wPl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28589);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28589);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmf
 * JD-Core Version:    0.6.2
 */