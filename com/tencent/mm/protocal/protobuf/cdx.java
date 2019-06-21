package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cdx extends bsr
{
  public String ptv;
  public String vGA;
  public cdv xdF;
  public cdv xdG;
  public int xdH;
  public int xdI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56504);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xdF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CommentDetail");
        AppMethodBeat.o(56504);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ptv != null)
        paramArrayOfObject.e(2, this.ptv);
      if (this.xdF != null)
      {
        paramArrayOfObject.iy(3, this.xdF.computeSize());
        this.xdF.writeFields(paramArrayOfObject);
      }
      if (this.xdG != null)
      {
        paramArrayOfObject.iy(6, this.xdG.computeSize());
        this.xdG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.xdH);
      paramArrayOfObject.iz(5, this.xdI);
      if (this.vGA != null)
        paramArrayOfObject.e(7, this.vGA);
      AppMethodBeat.o(56504);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label910;
    label910: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ptv != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ptv);
      i = paramInt;
      if (this.xdF != null)
        i = paramInt + e.a.a.a.ix(3, this.xdF.computeSize());
      paramInt = i;
      if (this.xdG != null)
        paramInt = i + e.a.a.a.ix(6, this.xdG.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(4, this.xdH) + e.a.a.b.b.a.bs(5, this.xdI);
      paramInt = i;
      if (this.vGA != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vGA);
      AppMethodBeat.o(56504);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xdF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CommentDetail");
          AppMethodBeat.o(56504);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56504);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cdx localcdx = (cdx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56504);
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
            localcdx.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56504);
          paramInt = i;
          break;
        case 2:
          localcdx.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56504);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cdv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcdx.xdF = paramArrayOfObject;
          }
          AppMethodBeat.o(56504);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cdv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cdv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcdx.xdG = ((cdv)localObject1);
          }
          AppMethodBeat.o(56504);
          paramInt = i;
          break;
        case 4:
          localcdx.xdH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56504);
          paramInt = i;
          break;
        case 5:
          localcdx.xdI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56504);
          paramInt = i;
          break;
        case 7:
          localcdx.vGA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56504);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56504);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cdx
 * JD-Core Version:    0.6.2
 */