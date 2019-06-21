package com.tencent.sqlitelint.behaviour.alert;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.behaviour.persistence.IssueStorage;
import com.tencent.sqlitelint.behaviour.persistence.SQLiteLintDbHelper;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.sqlitelint.util.SQLiteLintUtil;
import java.util.List;

public class CheckedDatabaseListActivity extends SQLiteLintBaseActivity
{
  private static final String TAG = "SQLiteLint.CheckedDatabaseListActivity";
  private CheckedDatabaseListAdapter mListAdapter;
  private ListView mListView;

  private void initView()
  {
    AppMethodBeat.i(94055);
    setTitle(getString(2131305859));
    this.mListView = ((ListView)findViewById(2131820986));
    this.mListAdapter = new CheckedDatabaseListAdapter(this);
    this.mListView.setAdapter(this.mListAdapter);
    this.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(94046);
        paramAnonymousView = (String)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
        if (SQLiteLintUtil.isNullOrNil(paramAnonymousView))
          AppMethodBeat.o(94046);
        while (true)
        {
          return;
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.setClass(CheckedDatabaseListActivity.this, CheckResultActivity.class);
          paramAnonymousAdapterView.putExtra("db_label", paramAnonymousView);
          CheckedDatabaseListActivity.this.startActivity(paramAnonymousAdapterView);
          AppMethodBeat.o(94046);
        }
      }
    });
    AppMethodBeat.o(94055);
  }

  private void refreshView()
  {
    AppMethodBeat.i(94056);
    List localList = IssueStorage.getDbPathList();
    SLog.i("SQLiteLint.CheckedDatabaseListActivity", "refreshView defectiveDbList is %d", new Object[] { Integer.valueOf(localList.size()) });
    this.mListAdapter.setData(localList);
    AppMethodBeat.o(94056);
  }

  protected int getLayoutId()
  {
    return 2130968623;
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(94053);
    super.onCreate(paramBundle);
    SQLiteLintDbHelper.INSTANCE.initialize(this);
    initView();
    AppMethodBeat.o(94053);
  }

  protected void onResume()
  {
    AppMethodBeat.i(94054);
    super.onResume();
    refreshView();
    AppMethodBeat.o(94054);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static class CheckedDatabaseListAdapter extends BaseAdapter
  {
    private List<String> mDefectiveDbList;
    private final LayoutInflater mInflater;

    CheckedDatabaseListAdapter(Context paramContext)
    {
      AppMethodBeat.i(94047);
      this.mInflater = LayoutInflater.from(paramContext);
      AppMethodBeat.o(94047);
    }

    public int getCount()
    {
      AppMethodBeat.i(94049);
      int i;
      if (this.mDefectiveDbList == null)
      {
        i = 0;
        AppMethodBeat.o(94049);
      }
      while (true)
      {
        return i;
        i = this.mDefectiveDbList.size();
        AppMethodBeat.o(94049);
      }
    }

    public String getItem(int paramInt)
    {
      AppMethodBeat.i(94050);
      String str = (String)this.mDefectiveDbList.get(paramInt);
      AppMethodBeat.o(94050);
      return str;
    }

    public long getItemId(int paramInt)
    {
      return 0L;
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(94051);
      if (paramView == null)
      {
        paramView = this.mInflater.inflate(2130971000, paramViewGroup, false);
        paramViewGroup = new CheckedDatabaseListActivity.ViewHolder();
        paramViewGroup.dbPathTv = ((TextView)paramView.findViewById(2131828432));
        paramView.setTag(paramViewGroup);
      }
      while (true)
      {
        String str = getItem(paramInt);
        paramViewGroup.dbPathTv.setText(str);
        AppMethodBeat.o(94051);
        return paramView;
        paramViewGroup = (CheckedDatabaseListActivity.ViewHolder)paramView.getTag();
      }
    }

    public void setData(List<String> paramList)
    {
      AppMethodBeat.i(94048);
      this.mDefectiveDbList = paramList;
      notifyDataSetChanged();
      AppMethodBeat.o(94048);
    }
  }

  static class ViewHolder
  {
    public TextView dbPathTv;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.behaviour.alert.CheckedDatabaseListActivity
 * JD-Core Version:    0.6.2
 */