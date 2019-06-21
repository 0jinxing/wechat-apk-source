package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.btd;
import e.a.a.b;
import java.util.LinkedList;

public final class df extends btd
{
  public String Title;
  public String mZR;
  public boolean mZy;
  public k ndD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111672);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(111672);
        throw paramArrayOfObject;
      }
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(111672);
        throw paramArrayOfObject;
      }
      if (this.mZR == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Message");
        AppMethodBeat.o(111672);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(2, this.mZy);
      if (this.Title != null)
        paramArrayOfObject.e(3, this.Title);
      if (this.mZR != null)
        paramArrayOfObject.e(4, this.mZR);
      if (this.ndD != null)
      {
        paramArrayOfObject.iy(5, this.ndD.computeSize());
        this.ndD.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(111672);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label800;
    label800: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.fv(2) + 1;
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Title);
      paramInt = i;
      if (this.mZR != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.mZR);
      i = paramInt;
      if (this.ndD != null)
        i = paramInt + e.a.a.a.ix(5, this.ndD.computeSize());
      AppMethodBeat.o(111672);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(111672);
          throw paramArrayOfObject;
        }
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(111672);
          throw paramArrayOfObject;
        }
        if (this.mZR == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Message");
          AppMethodBeat.o(111672);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111672);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        df localdf = (df)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111672);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdf.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(111672);
          paramInt = i;
          break;
        case 2:
          localdf.mZy = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111672);
          paramInt = i;
          break;
        case 3:
          localdf.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111672);
          paramInt = i;
          break;
        case 4:
          localdf.mZR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111672);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new k();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdf.ndD = paramArrayOfObject;
          }
          AppMethodBeat.o(111672);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111672);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.df
 * JD-Core Version:    0.6.2
 */