package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class GetEmotionListResponse extends btd
{
  public EmotionBanner Banner;
  public int BannerSetCount;
  public LinkedList<EmotionBannerSet> BannerSetList;
  public int CellCount;
  public LinkedList<EmotionCell> CellList;
  public int CellSetCount;
  public LinkedList<EmotionBannerSet> CellSetList;
  public int EmotionCount;
  public String EmotionExptConfig;
  public LinkedList<EmotionSummary> EmotionList;
  public int NewBannerCount;
  public LinkedList<EmotionBanner> NewBannerList;
  public int RecentHotNum;
  public SKBuiltinBuffer_t ReqBuf;
  public int TopHotNum;

  public GetEmotionListResponse()
  {
    AppMethodBeat.i(62564);
    this.EmotionList = new LinkedList();
    this.NewBannerList = new LinkedList();
    this.CellList = new LinkedList();
    this.BannerSetList = new LinkedList();
    this.CellSetList = new LinkedList();
    AppMethodBeat.o(62564);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62565);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(62565);
        throw paramArrayOfObject;
      }
      if (this.ReqBuf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReqBuf");
        AppMethodBeat.o(62565);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.ReqBuf != null)
      {
        paramArrayOfObject.iy(2, this.ReqBuf.computeSize());
        this.ReqBuf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.EmotionCount);
      paramArrayOfObject.e(4, 8, this.EmotionList);
      if (this.Banner != null)
      {
        paramArrayOfObject.iy(5, this.Banner.computeSize());
        this.Banner.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.NewBannerCount);
      paramArrayOfObject.e(7, 8, this.NewBannerList);
      paramArrayOfObject.iz(8, this.CellCount);
      paramArrayOfObject.e(9, 8, this.CellList);
      paramArrayOfObject.iz(10, this.BannerSetCount);
      paramArrayOfObject.e(11, 8, this.BannerSetList);
      paramArrayOfObject.iz(12, this.TopHotNum);
      paramArrayOfObject.iz(13, this.RecentHotNum);
      paramArrayOfObject.iz(14, this.CellSetCount);
      paramArrayOfObject.e(15, 8, this.CellSetList);
      if (this.EmotionExptConfig != null)
        paramArrayOfObject.e(16, this.EmotionExptConfig);
      AppMethodBeat.o(62565);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1845;
    label1845: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ReqBuf != null)
        i = paramInt + e.a.a.a.ix(2, this.ReqBuf.computeSize());
      i = i + e.a.a.b.b.a.bs(3, this.EmotionCount) + e.a.a.a.c(4, 8, this.EmotionList);
      paramInt = i;
      if (this.Banner != null)
        paramInt = i + e.a.a.a.ix(5, this.Banner.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(6, this.NewBannerCount) + e.a.a.a.c(7, 8, this.NewBannerList) + e.a.a.b.b.a.bs(8, this.CellCount) + e.a.a.a.c(9, 8, this.CellList) + e.a.a.b.b.a.bs(10, this.BannerSetCount) + e.a.a.a.c(11, 8, this.BannerSetList) + e.a.a.b.b.a.bs(12, this.TopHotNum) + e.a.a.b.b.a.bs(13, this.RecentHotNum) + e.a.a.b.b.a.bs(14, this.CellSetCount) + e.a.a.a.c(15, 8, this.CellSetList);
      paramInt = i;
      if (this.EmotionExptConfig != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.EmotionExptConfig);
      AppMethodBeat.o(62565);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.EmotionList.clear();
        this.NewBannerList.clear();
        this.CellList.clear();
        this.BannerSetList.clear();
        this.CellSetList.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(62565);
          throw paramArrayOfObject;
        }
        if (this.ReqBuf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReqBuf");
          AppMethodBeat.o(62565);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62565);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        GetEmotionListResponse localGetEmotionListResponse = (GetEmotionListResponse)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62565);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localGetEmotionListResponse.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localGetEmotionListResponse.ReqBuf = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 3:
          localGetEmotionListResponse.EmotionCount = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new EmotionSummary();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((EmotionSummary)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localGetEmotionListResponse.EmotionList.add(localObject1);
          }
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new EmotionBanner();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((EmotionBanner)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localGetEmotionListResponse.Banner = ((EmotionBanner)localObject1);
          }
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 6:
          localGetEmotionListResponse.NewBannerCount = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new EmotionBanner();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((EmotionBanner)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localGetEmotionListResponse.NewBannerList.add(localObject1);
          }
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 8:
          localGetEmotionListResponse.CellCount = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new EmotionCell();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((EmotionCell)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localGetEmotionListResponse.CellList.add(localObject1);
          }
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 10:
          localGetEmotionListResponse.BannerSetCount = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new EmotionBannerSet();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localGetEmotionListResponse.BannerSetList.add(paramArrayOfObject);
          }
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 12:
          localGetEmotionListResponse.TopHotNum = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 13:
          localGetEmotionListResponse.RecentHotNum = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 14:
          localGetEmotionListResponse.CellSetCount = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 15:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new EmotionBannerSet();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localGetEmotionListResponse.CellSetList.add(paramArrayOfObject);
          }
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        case 16:
          localGetEmotionListResponse.EmotionExptConfig = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62565);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62565);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.GetEmotionListResponse
 * JD-Core Version:    0.6.2
 */