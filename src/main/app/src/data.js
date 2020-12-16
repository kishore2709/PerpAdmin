import React from "react";
import GridOn from "@material-ui/icons/GridOn";
import PermIdentity from "@material-ui/icons/PermIdentity";
import Web from "@material-ui/icons/Web";
import BorderClear from "@material-ui/icons/BorderClear";
import BorderOuter from "@material-ui/icons/BorderOuter";
import AccountBalance from "@material-ui/icons/AccountBalance";
import Dashboard from "@material-ui/icons/Dashboard";

import Description from "@material-ui/icons/Description";
import Group from "@material-ui/icons/Group";
import Build from "@material-ui/icons/Build";
import AccountBox from "@material-ui/icons/AccountBox";
import SwapHoriz from "@material-ui/icons/SwapHoriz";
import AttachMoney from "@material-ui/icons/AttachMoney";
import avtar from "./assets/images/avtar.jpeg";
import SearchIcon from "@material-ui/icons/Search";
import AssessmentIcon from "@material-ui/icons/Assessment";
import AssignmentTurnedInIcon from "@material-ui/icons/AssignmentTurnedIn";
import CreateNewFolderIcon from "@material-ui/icons/CreateNewFolder";
import DescriptionIcon from "@material-ui/icons/Description";
import InsertDriveFileIcon from "@material-ui/icons/InsertDriveFile";
import NoteAddIcon from "@material-ui/icons/NoteAdd";
import AssignmentIcon from "@material-ui/icons/Assignment";

export const regSubTypes = [
  // {
  //   option: "Compression Ignition (Diesel)",
  //   value: 1
  // },
  // {
  //   option: "Spark Ignition",
  //   value: 2
  // },
  {
    option: "  Sand & Gravel Screening and Rock Crushing",
    value: 3,
  },
  {
    option: "Concrete Batch Plant",
    value: 4,
  },
  {
    option: "Abrasive Blasting",
    value: 5,
  },
  // {
  //   option: "Tactical Support Equipment",
  //   value: 7
  // },
  {
    option: "Miscellaneous",
    value: 8,
  },
  // {
  //   option: "Pile Driver",
  //   value: 9
  // },
  {
    option: "Wood Processing",
    value: 10,
  },
  {
    option: "Storage Silo",
    value: 11,
  },
  {
    option: "Rock Drill",
    value: 12,
  },
  {
    option: "Slurry Mixer",
    value: 13,
  },
  {
    option: "Road Surface Processing (Pavement Crushing & Recycling)",
    value: 14,
  },
  {
    option: "Converted Data",
    value: 15,
  },
  {
    option: "Unknown",
    value: 16,
  },
];

export const regSubSubTypes = [
  {
    option: "Tub Grinder",
    value: 1,
  },
  {
    option: "Trommel Screen",
    value: 2,
  },
  {
    option: "Hammer Mill",
    value: 3,
  },
  {
    option: "Horizontal Grinder",
    value: 4,
  },
  {
    option: "Wood Chipper",
    value: 5,
  },
  {
    option: "Transfer Conveyor",
    value: 8,
  },
  {
    option: "Compost Turner",
    value: 10,
  },
  {
    option: "Shredder",
    value: 11,
  },
  {
    option: "Cement Slurry Mixer",
    value: 12,
  },
  {
    option: "Lime Slurry Mixer",
    value: 13,
  },
  {
    option: "Crushing plant",
    value: 14,
  },
  {
    option: "Screening plant",
    value: 15,
  },
  {
    option: "Grinder",
    value: 16,
  },
  {
    option: "Planer",
    value: 17,
  },
  {
    option: "Truck Mix",
    value: 18,
  },
  {
    option: "Central Mix",
    value: 19,
  },
  {
    option: "Trenching Machine",
    value: 20,
  },
  {
    option: "Cold Planer",
    value: 21,
  },
  {
    option: "Crushing and screening plant",
    value: 22,
  },
  {
    option: "Wood/Misc Processing Screen",
    value: 23,
  },
  {
    option: "Milling Machine",
    value: 24,
  },
  {
    option: "Pavement Grinder",
    value: 25,
  },
  {
    option: "Conveyor",
    value: 26,
  },
  {
    option: "Aggregate Slurry Mixer",
    value: 27,
  },
  {
    option: "Reclaimer Machine",
    value: 28,
  },
  {
    option: "Mixing Plant",
    value: 29,
  },
  {
    option: "Stump Cutter",
    value: 30,
  },
  {
    option: "Soil Stabilizer",
    value: 31,
  },
  {
    option: "Radial Stacker",
    value: 32,
  },
  {
    option: "Blending Plant",
    value: 33,
  },
  {
    option: "Rip Rap Plant",
    value: 34,
  },
];

export const reportDet = [
  {
    id: 1,
    companyName: "United Parcel Service	",
    Fee: "315",
    request: "Initial Registration",
  },
  {
    id: 2,
    companyName: "Hogg Drilling Specialty Construction, Inc.		",
    Fee: "315",
    request: "Registration Renewals",
  },
  {
    id: 3,
    companyName: "Robertson's		",
    Fee: "315",
    request: "Change of Ownership",
  },
  {
    id: 4,
    companyName: "Foundation Pile, Inc.		",
    Fee: "315",
    request: "Change of Ownership",
  },
  {
    id: 5,
    companyName: "Dave Soiland Company	",
    Fee: "315",
    request: "Initial Registration",
  },
  {
    id: 6,
    companyName: "Dave Soiland Company	",
    Fee: "315",
    request: "Initial Registration",
  },
  {
    id: 7,
    companyName: "Dave Soiland Company	",
    Fee: "315",
    request: "Initial Registration",
  },
  {
    id: 8,
    companyName: "Dave Soiland Company	",
    Fee: "315",
    request: "Initial Registration",
  },
  {
    id: 9,
    companyName: "Dave Soiland Company	",
    Fee: "315",
    request: "Initial Registration",
  },
];
const data = {
  menus: [
    { text: "DashBoard", icon: <Dashboard />, link: "/dashboard" },
    {
      text: "Search",
      icon: <SearchIcon />,
      // link: "/table",
      subMenus: [
        {
          text: "Company Search",
          icon: <SearchIcon />,
          link: "/comingsoon",
        },
        {
          text: "Application Search",
          icon: <SearchIcon />,
          link: "/comingsoon",
        },
        {
          text: "Equipment Search",
          icon: <SearchIcon />,
          link: "/comingsoon",
        },
        {
          text: "Transaction Search",
          icon: <SearchIcon />,
          link: "/comingsoon",
        },
        {
          text: "Invoice Search",
          icon: <SearchIcon />,
          link: "/comingsoon",
        },
        {
          text: "Notes Search",
          icon: <SearchIcon />,
          link: "/comingsoon",
        },
      ],
    },
    {
      text: "Trackinator",
      icon: <AssessmentIcon />,
      // link: "/table",
      subMenus: [
        {
          text: "Create App",
          icon: <CreateNewFolderIcon />,
          link: "/createapp",
        },
        {
          text: "Task List",
          icon: <AssignmentTurnedInIcon />,
          link: "/tasklist",
        },
        {
          text: "App List",
          icon: <AssignmentTurnedInIcon />,
          link: "/applist",
        },
      ],
    },
    {
      text: "Company Letters",
      icon: <DescriptionIcon />,
      // link: "/table",
      subMenus: [
        {
          text: "Invoice Letters",
          icon: <InsertDriveFileIcon />,
          link: "/comingsoon",
        },
        {
          text: "Letter Templates",
          icon: <NoteAddIcon />,
          link: "/comingsoon",
        },
        {
          text: "Letter Template Text",
          icon: <AssignmentIcon />,
          link: "/comingsoon",
        },
      ],
    },
    {
      text: "Reports",
      icon: <DescriptionIcon />,
      // link: "/table",
      subMenus: [
        {
          text: "Annual Reports",
          icon: <InsertDriveFileIcon />,
          link: "/comingsoon",
        },
        {
          text: "Activity Reports",
          icon: <NoteAddIcon />,
          link: "/comingsoon",
        },
        {
          text: "Company Account Reports",
          icon: <AssignmentIcon />,
          link: "/comingsoon",
        },
        {
          text: "District Reports",
          icon: <AssignmentIcon />,
          link: "/comingsoon",
        },
        {
          text: "Financial Reports",
          icon: <AssignmentIcon />,
          link: "/comingsoon",
        },
        {
          text: "Renewal Mailing List",
          icon: <AssignmentIcon />,
          link: "/comingsoon",
        },
      ],
    },
    {
      text: "Admin Tools",
      icon: <Build />,
      // link: "/table",
      subMenus: [
        {
          text: "Code Table Maintenance",
          icon: <SwapHoriz />,
          link: "/comingsoon",
        },
        {
          text: "Alerts Maintenance",
          icon: <SwapHoriz />,
          link: "/comingsoon",
        },
        {
          text: "Equipment SwitchTool",
          icon: <SwapHoriz />,
          link: "/equipmentswitch",
        },
        {
          text: "Fee Management",
          icon: <AttachMoney />,
          link: "/comingsoon",
        },
        {
          text: "Generate Sticker Print",
          icon: <AttachMoney />,
          link: "/comingsoon",
        },
        {
          text: "Operating Conditions",
          icon: <SwapHoriz />,
          link: "/comingsoon",
        },
      ],
    },

    {
      text: "Fleet Management",
      icon: <GridOn />,
      // link: "/table",
      subMenus: [
        {
          text: "Create New Fleet",
          icon: <BorderClear />,
          link: "/comingsoon",
        },
        {
          text: "Modify Existing Fleet",
          icon: <BorderClear />,
          link: "/comingsoon",
        },
      ],
    },
    {
      text: "User Management",
      icon: <Group />,
      // link: "/table",
      subMenus: [
        {
          text: "User Search",
          icon: <AccountBox />,
          link: "/comingsoon",
        },
        {
          text: "User List",
          icon: <AccountBox />,
          link: "/comingsoon",
        },
        {
          text: "User Roles",
          icon: <AccountBox />,
          link: "/comingsoon",
        },
      ],
    },

    { text: "Update Checker", icon: <Description />, link: "/comingsoon" },

    { text: "Form Page", icon: <Web />, link: "/form" },
    {
      text: "Reports",
      icon: <GridOn />,
      // link: "/table",
      subMenus: [
        {
          text: "Data Report",
          icon: <BorderOuter />,
          link: "/table/data",
        },
        {
          text: "Basic Report",
          icon: <BorderClear />,
          link: "/table/basic",
        },
        {
          text: "Create New Report from Template",
          icon: <BorderOuter />,
          link: "/comingsoon",
        },
        {
          text: "Create Customized Report from Template",
          icon: <BorderOuter />,
          link: "/comingsoon",
        },
        {
          text: "All Units Reports",
          icon: <BorderClear />,
          link: "/comingsoon",
        },
        {
          text: "Company Reports",
          icon: <BorderClear />,
          link: "/comingsoon",
        },
        {
          text: "District Reports",
          icon: <BorderClear />,
          link: "/comingsoon",
        },
        {
          text: "Annual Reports",
          icon: <BorderClear />,
          link: "/comingsoon",
        },
      ],
    },
    { text: "Login Page", icon: <PermIdentity />, link: "/login" },
  ],
  user: {
    userName: "Full Name",
    avatar: avtar,
  },

  dashBoardPage: {
    recentProducts: [
      {
        id: 1,
        title: "Initial Registration Request",
        text: "	United Rentals (North America), Inc.",
      },
      { id: 2, title: "Change of Ownership", text: "Sunbelt Rentals" },
      {
        id: 3,
        title: "Registration Renewal",
        text: "	City of San Diego",
      },
      {
        id: 4,
        title: "Intial Registration",
        text: "BlueLine Rental, LLC	",
      },
    ],
    monthlySales: [
      { name: "Jan", uv: 3700 },
      { name: "Feb", uv: 3000 },
      { name: "Mar", uv: 2000 },
      { name: "Apr", uv: 2780 },
      { name: "May", uv: 2000 },
      { name: "Jun", uv: 1800 },
      { name: "Jul", uv: 2600 },
      { name: "Aug", uv: 2900 },
      { name: "Sep", uv: 3500 },
      { name: "Oct", uv: 3000 },
      { name: "Nov", uv: 2400 },
      { name: "Dec", uv: 2780 },
    ],
    newOrders: [
      { pv: 2400 },
      { pv: 1398 },
      { pv: 9800 },
      { pv: 3908 },
      { pv: 4800 },
      { pv: 3490 },
      { pv: 4300 },
    ],
    appTypes: [
      { name: "New Registrations", value: 500 },
      { name: "Registration Renewals", value: 200 },
      { name: "Change of Ownership", value: 80 },
      { name: "Placard Replacement", value: 150 },
    ],
  },
  // tablePage: {
  //   items: Array.from({ length: 105 }, (item, index) => ({
  //     id: index,
  //     name: Faker.commerce.productName(),
  //     price: Faker.commerce.price(),
  //     category: Faker.commerce.productMaterial()
  //   }))
  // },

  tablePage: {
    items: reportDet,
  },
};

export default data;
