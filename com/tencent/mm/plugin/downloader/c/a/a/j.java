package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class j extends bsr
{
  public String egm;
  public String kKB;
  public String source;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35519);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.egm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: download_url");
        AppMethodBeat.o(35519);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.egm != null)
        paramArrayOfObject.e(2, this.egm);
      if (this.kKB != null)
        paramArrayOfObject.e(3, this.kKB);
      if (this.source != null)
        paramArrayOfObject.e(4, this.source);
      AppMethodBeat.o(35519);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label560;
    label560: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.egm != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.egm);
      i = paramInt;
      if (this.kKB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kKB);
      paramInt = i;
      if (this.source != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.source);
      AppMethodBeat.o(35519);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.egm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: download_url");
          AppMethodBeat.o(35519);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(35519);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        j localj = (j)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35519);
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
            localj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(35519);
          paramInt = i;
          break;
        case 2:
          localj.egm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35519);
          paramInt = i;
          break;
        case 3:
          localj.kKB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35519);
          paramInt = i;
          break;
        case 4:
          localj.source = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35519);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35519);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.a.a.j
 * JD-Core Version:    0.6.2
 */