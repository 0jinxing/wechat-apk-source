package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bw extends bsr
{
  public String csB;
  public String fileid;
  public String nickname;
  public b vEc;
  public int vEd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10151);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.nickname != null)
        paramArrayOfObject.e(2, this.nickname);
      if (this.vEc != null)
        paramArrayOfObject.c(3, this.vEc);
      if (this.fileid != null)
        paramArrayOfObject.e(4, this.fileid);
      paramArrayOfObject.iz(5, this.vEd);
      if (this.csB != null)
        paramArrayOfObject.e(6, this.csB);
      AppMethodBeat.o(10151);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label638;
    label638: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nickname != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nickname);
      i = paramInt;
      if (this.vEc != null)
        i = paramInt + e.a.a.b.b.a.b(3, this.vEc);
      paramInt = i;
      if (this.fileid != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.fileid);
      i = paramInt + e.a.a.b.b.a.bs(5, this.vEd);
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.csB);
      AppMethodBeat.o(10151);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10151);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bw localbw = (bw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10151);
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
            localbw.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(10151);
          paramInt = i;
          break;
        case 2:
          localbw.nickname = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10151);
          paramInt = i;
          break;
        case 3:
          localbw.vEc = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(10151);
          paramInt = i;
          break;
        case 4:
          localbw.fileid = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10151);
          paramInt = i;
          break;
        case 5:
          localbw.vEd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10151);
          paramInt = i;
          break;
        case 6:
          localbw.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10151);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10151);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bw
 * JD-Core Version:    0.6.2
 */