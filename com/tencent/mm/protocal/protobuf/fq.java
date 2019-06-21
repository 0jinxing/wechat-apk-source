package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class fq extends com.tencent.mm.bt.a
{
  public String Name;
  public String Title;
  public String vEA;
  public fr vHA;
  public String vHz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94510);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vHA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ArtisIcon");
        AppMethodBeat.o(94510);
        throw paramArrayOfObject;
      }
      if (this.Name != null)
        paramArrayOfObject.e(1, this.Name);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.vHz != null)
        paramArrayOfObject.e(3, this.vHz);
      if (this.vEA != null)
        paramArrayOfObject.e(4, this.vEA);
      if (this.vHA != null)
      {
        paramArrayOfObject.iy(5, this.vHA.computeSize());
        this.vHA.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94510);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Name == null)
        break label623;
    label623: for (paramInt = e.a.a.b.b.a.f(1, this.Name) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Title);
      paramInt = i;
      if (this.vHz != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vHz);
      i = paramInt;
      if (this.vEA != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vEA);
      paramInt = i;
      if (this.vHA != null)
        paramInt = i + e.a.a.a.ix(5, this.vHA.computeSize());
      AppMethodBeat.o(94510);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vHA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ArtisIcon");
          AppMethodBeat.o(94510);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94510);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fq localfq = (fq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94510);
          break;
        case 1:
          localfq.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94510);
          paramInt = i;
          break;
        case 2:
          localfq.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94510);
          paramInt = i;
          break;
        case 3:
          localfq.vHz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94510);
          paramInt = i;
          break;
        case 4:
          localfq.vEA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94510);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new fr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfq.vHA = paramArrayOfObject;
          }
          AppMethodBeat.o(94510);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94510);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fq
 * JD-Core Version:    0.6.2
 */