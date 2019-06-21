package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ayg extends bsr
{
  public int cKJ;
  public String fha;
  public String lCH;
  public String username;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28539);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(28539);
        throw paramArrayOfObject;
      }
      if (this.lCH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: appusername");
        AppMethodBeat.o(28539);
        throw paramArrayOfObject;
      }
      if (this.fha == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: rankid");
        AppMethodBeat.o(28539);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.username != null)
        paramArrayOfObject.e(2, this.username);
      if (this.lCH != null)
        paramArrayOfObject.e(3, this.lCH);
      paramArrayOfObject.iz(4, this.cKJ);
      if (this.fha != null)
        paramArrayOfObject.e(5, this.fha);
      AppMethodBeat.o(28539);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label723;
    label723: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.username != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.username);
      i = paramInt;
      if (this.lCH != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.lCH);
      i += e.a.a.b.b.a.bs(4, this.cKJ);
      paramInt = i;
      if (this.fha != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.fha);
      AppMethodBeat.o(28539);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.username == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: username");
          AppMethodBeat.o(28539);
          throw paramArrayOfObject;
        }
        if (this.lCH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: appusername");
          AppMethodBeat.o(28539);
          throw paramArrayOfObject;
        }
        if (this.fha == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: rankid");
          AppMethodBeat.o(28539);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28539);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ayg localayg = (ayg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28539);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localayg.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28539);
          paramInt = i;
          break;
        case 2:
          localayg.username = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28539);
          paramInt = i;
          break;
        case 3:
          localayg.lCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28539);
          paramInt = i;
          break;
        case 4:
          localayg.cKJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28539);
          paramInt = i;
          break;
        case 5:
          localayg.fha = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28539);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28539);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayg
 * JD-Core Version:    0.6.2
 */