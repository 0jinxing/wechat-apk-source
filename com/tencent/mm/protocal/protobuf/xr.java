package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class xr extends bsr
{
  public String csB;
  public String key;
  public String query;
  public int scene;
  public String url;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96218);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.key != null)
        paramArrayOfObject.e(2, this.key);
      if (this.csB != null)
        paramArrayOfObject.e(3, this.csB);
      if (this.query != null)
        paramArrayOfObject.e(4, this.query);
      paramArrayOfObject.iz(5, this.scene);
      if (this.url != null)
        paramArrayOfObject.e(6, this.url);
      AppMethodBeat.o(96218);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label626;
    label626: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.key != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.key);
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.csB);
      i = paramInt;
      if (this.query != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.query);
      i += e.a.a.b.b.a.bs(5, this.scene);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.url);
      AppMethodBeat.o(96218);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96218);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xr localxr = (xr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96218);
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
            localxr.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(96218);
          paramInt = i;
          break;
        case 2:
          localxr.key = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96218);
          paramInt = i;
          break;
        case 3:
          localxr.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96218);
          paramInt = i;
          break;
        case 4:
          localxr.query = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96218);
          paramInt = i;
          break;
        case 5:
          localxr.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96218);
          paramInt = i;
          break;
        case 6:
          localxr.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96218);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96218);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xr
 * JD-Core Version:    0.6.2
 */