package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ane extends bsr
{
  public int Height;
  public String URL;
  public int Width;
  public String wrL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10184);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.URL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: URL");
        AppMethodBeat.o(10184);
        throw paramArrayOfObject;
      }
      if (this.wrL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserAgent");
        AppMethodBeat.o(10184);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.URL != null)
        paramArrayOfObject.e(2, this.URL);
      if (this.wrL != null)
        paramArrayOfObject.e(3, this.wrL);
      paramArrayOfObject.iz(4, this.Width);
      paramArrayOfObject.iz(5, this.Height);
      AppMethodBeat.o(10184);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label654;
    label654: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.URL != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.URL);
      i = paramInt;
      if (this.wrL != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wrL);
      paramInt = i + e.a.a.b.b.a.bs(4, this.Width) + e.a.a.b.b.a.bs(5, this.Height);
      AppMethodBeat.o(10184);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.URL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: URL");
          AppMethodBeat.o(10184);
          throw paramArrayOfObject;
        }
        if (this.wrL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserAgent");
          AppMethodBeat.o(10184);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10184);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ane localane = (ane)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10184);
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
            localane.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(10184);
          paramInt = i;
          break;
        case 2:
          localane.URL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10184);
          paramInt = i;
          break;
        case 3:
          localane.wrL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10184);
          paramInt = i;
          break;
        case 4:
          localane.Width = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10184);
          paramInt = i;
          break;
        case 5:
          localane.Height = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10184);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10184);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ane
 * JD-Core Version:    0.6.2
 */