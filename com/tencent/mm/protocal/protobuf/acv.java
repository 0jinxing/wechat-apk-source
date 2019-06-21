package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class acv extends com.tencent.mm.bt.a
{
  public String IconUrl;
  public String Name;
  public String fKh;
  public String mZt;
  public String wbw;
  public ade wkA;
  public int wkB;
  public String wkC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112420);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fKh == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppId");
        AppMethodBeat.o(112420);
        throw paramArrayOfObject;
      }
      if (this.Name == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Name");
        AppMethodBeat.o(112420);
        throw paramArrayOfObject;
      }
      if (this.wbw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Remark");
        AppMethodBeat.o(112420);
        throw paramArrayOfObject;
      }
      if (this.IconUrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: IconUrl");
        AppMethodBeat.o(112420);
        throw paramArrayOfObject;
      }
      if (this.wkA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DownloadInfo");
        AppMethodBeat.o(112420);
        throw paramArrayOfObject;
      }
      if (this.fKh != null)
        paramArrayOfObject.e(1, this.fKh);
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      if (this.wbw != null)
        paramArrayOfObject.e(3, this.wbw);
      if (this.IconUrl != null)
        paramArrayOfObject.e(4, this.IconUrl);
      if (this.mZt != null)
        paramArrayOfObject.e(5, this.mZt);
      if (this.wkA != null)
      {
        paramArrayOfObject.iy(6, this.wkA.computeSize());
        this.wkA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.wkB);
      if (this.wkC != null)
        paramArrayOfObject.e(8, this.wkC);
      AppMethodBeat.o(112420);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fKh == null)
        break label996;
    label996: for (paramInt = e.a.a.b.b.a.f(1, this.fKh) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.Name != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.Name);
      paramInt = i;
      if (this.wbw != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wbw);
      i = paramInt;
      if (this.IconUrl != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.IconUrl);
      paramInt = i;
      if (this.mZt != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.mZt);
      i = paramInt;
      if (this.wkA != null)
        i = paramInt + e.a.a.a.ix(6, this.wkA.computeSize());
      i += e.a.a.b.b.a.bs(7, this.wkB);
      paramInt = i;
      if (this.wkC != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wkC);
      AppMethodBeat.o(112420);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.fKh == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppId");
          AppMethodBeat.o(112420);
          throw paramArrayOfObject;
        }
        if (this.Name == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Name");
          AppMethodBeat.o(112420);
          throw paramArrayOfObject;
        }
        if (this.wbw == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Remark");
          AppMethodBeat.o(112420);
          throw paramArrayOfObject;
        }
        if (this.IconUrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: IconUrl");
          AppMethodBeat.o(112420);
          throw paramArrayOfObject;
        }
        if (this.wkA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DownloadInfo");
          AppMethodBeat.o(112420);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(112420);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        acv localacv = (acv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(112420);
          break;
        case 1:
          localacv.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112420);
          paramInt = i;
          break;
        case 2:
          localacv.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112420);
          paramInt = i;
          break;
        case 3:
          localacv.wbw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112420);
          paramInt = i;
          break;
        case 4:
          localacv.IconUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112420);
          paramInt = i;
          break;
        case 5:
          localacv.mZt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112420);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ade();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localacv.wkA = paramArrayOfObject;
          }
          AppMethodBeat.o(112420);
          paramInt = i;
          break;
        case 7:
          localacv.wkB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(112420);
          paramInt = i;
          break;
        case 8:
          localacv.wkC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112420);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(112420);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acv
 * JD-Core Version:    0.6.2
 */