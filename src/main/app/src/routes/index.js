import Signin from "../pages/Landing/Auth/signin";
import Signup from "../pages/Landing/Auth/signup";
import Signout from "../pages/Landing/Auth/signout";

import Welcome from "../pages/Landing/welcome";
import Aboutus from "../pages/Landing/aboutus";

import Contactus from "../pages/Landing/contactus";
import LoginLayout from "../layouts/Landing/LandingLayout";

import Dashboard from "../pages/Dashboard/DashboardPage";
import Form from "../pages/Dashboard/FormPage";
import BasicTable from "../pages/Table/BasicTables";
import DataTable from "../pages/Table/DataTables";
import ComingSoon from "../pages/ComingSoon";
import EquipmentSwitch from "../pages/EquipmentSwitch";
import CreateApp from "../pages/AppTracker/CreateApp";
import AppList from "../pages/AppTracker/AppList";
import TaskList from "../pages/AppTracker/TaskList";
import DashboardLayout from "../layouts/Dashboard/DashboardLayout";
export const publicRoutes = [
  {
    path: "/",
    layout: LoginLayout,
    component: Welcome,
  },
  {
    path: "/signin",
    layout: LoginLayout,
    component: Signin,
  },
  {
    path: "/signup",
    layout: LoginLayout,
    component: Signup,
  },
  {
    path: "/aboutus",
    layout: LoginLayout,
    component: Aboutus,
  },
  {
    path: "/contactus",
    layout: LoginLayout,
    component: Contactus,
  },
];

export const dashboardRoutes = [
  {
    path: "/",
    layout: DashboardLayout,
    key: "default",
    component: Dashboard,
  },
  {
    path: "/signin",
    layout: DashboardLayout,
    component: Dashboard,
  },
  {
    path: "/signout",
    layout: DashboardLayout,
    component: Signout,
  },
  {
    path: "/dashboard",
    layout: DashboardLayout,
    key: "dashboard",
    component: Dashboard,
  },
  {
    path: "/form",
    layout: DashboardLayout,
    key: "form",
    component: Form,
  },
  {
    path: "/table/basic",
    layout: DashboardLayout,
    key: "basic",
    component: BasicTable,
  },
  {
    path: "/table/data",
    layout: DashboardLayout,
    key: "data",
    component: DataTable,
  },
  {
    path: "/comingsoon",
    layout: DashboardLayout,
    key: "comingsoon",
    component: ComingSoon,
  },
  {
    path: "/createapp",
    layout: DashboardLayout,
    key: "createapp",
    component: CreateApp,
  },
  {
    path: "/applist",
    layout: DashboardLayout,
    key: "applist",
    component: AppList,
  },
  {
    path: "/tasklist",
    layout: DashboardLayout,
    key: "tasklist",
    component: TaskList,
  },

  {
    path: "/equipmentswitch",
    layout: DashboardLayout,
    key: "equipmentswitch",
    component: EquipmentSwitch,
  },
];
