package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aps extends bsr
{
  public String fha;
  public String lCH;
  public boolean wtL;
  public String wtM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28481);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.lCH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: appusername");
        AppMethodBeat.o(28481);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(2, this.wtL);
      if (this.fha != null)
        paramArrayOfObject.e(3, this.fha);
      if (this.lCH != null)
        paramArrayOfObject.e(4, this.lCH);
      if (this.wtM != null)
        paramArrayOfObject.e(5, this.wtM);
      AppMethodBeat.o(28481);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label618;
    label618: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 1);
      paramInt = i;
      if (this.fha != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.fha);
      i = paramInt;
      if (this.lCH != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.lCH);
      paramInt = i;
      if (this.wtM != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wtM);
      AppMethodBeat.o(28481);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.lCH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: appusername");
          AppMethodBeat.o(28481);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28481);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aps localaps = (aps)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28481);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaps.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28481);
          paramInt = i;
          break;
        case 2:
          localaps.wtL = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(28481);
          paramInt = i;
          break;
        case 3:
          localaps.fha = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28481);
          paramInt = i;
          break;
        case 4:
          localaps.lCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28481);
          paramInt = i;
          break;
        case 5:
          localaps.wtM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28481);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28481);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aps
 * JD-Core Version:    0.6.2
 */