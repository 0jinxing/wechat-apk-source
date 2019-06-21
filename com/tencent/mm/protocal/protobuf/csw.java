package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class csw extends bsr
{
  public String query;
  public int wCu;
  public String wCy;
  public String xqb;
  public String xqg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(93811);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.query != null)
        paramArrayOfObject.e(2, this.query);
      paramArrayOfObject.iz(3, this.wCu);
      if (this.wCy != null)
        paramArrayOfObject.e(99, this.wCy);
      if (this.xqb != null)
        paramArrayOfObject.e(100, this.xqb);
      if (this.xqg != null)
        paramArrayOfObject.e(101, this.xqg);
      AppMethodBeat.o(93811);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label650;
    label650: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.query != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.query);
      i += e.a.a.b.b.a.bs(3, this.wCu);
      paramInt = i;
      if (this.wCy != null)
        paramInt = i + e.a.a.b.b.a.f(99, this.wCy);
      i = paramInt;
      if (this.xqb != null)
        i = paramInt + e.a.a.b.b.a.f(100, this.xqb);
      paramInt = i;
      if (this.xqg != null)
        paramInt = i + e.a.a.b.b.a.f(101, this.xqg);
      AppMethodBeat.o(93811);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(93811);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        csw localcsw = (csw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(93811);
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
            localcsw.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(93811);
          paramInt = i;
          break;
        case 2:
          localcsw.query = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93811);
          paramInt = i;
          break;
        case 3:
          localcsw.wCu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(93811);
          paramInt = i;
          break;
        case 99:
          localcsw.wCy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93811);
          paramInt = i;
          break;
        case 100:
          localcsw.xqb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93811);
          paramInt = i;
          break;
        case 101:
          localcsw.xqg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(93811);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(93811);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csw
 * JD-Core Version:    0.6.2
 */